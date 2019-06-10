FROM phusion/baseimage
LABEL maintainer="affandhia@gmail.com"

# change to tmp folder
WORKDIR /tmp

# This is in accordance to : https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-get-on-ubuntu-16-04
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y ant && \
    apt-get install -y wget && \
    apt-get install -y net-tools && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* && \
    rm -rf /var/cache/oracle-jdk8-installer;

# Fix certificate issues, found as of 
# https://bugs.launchpad.net/ubuntu/+source/ca-certificates-java/+bug/983302
RUN apt-get install -y ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f && \
    rm -rf /var/lib/apt/lists/* && \
    rm -rf /var/cache/oracle-jdk8-installer;

# Setup JAVA_HOME, this is useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
RUN export JAVA_HOME

ENV ANT_VERSION=1.10.3
ENV ANT_HOME=/opt/ant

# Download and extract apache ant to opt folder
RUN wget --no-check-certificate --no-cookies http://archive.apache.org/dist/ant/binaries/apache-ant-${ANT_VERSION}-bin.tar.gz \
    && wget --no-check-certificate --no-cookies http://archive.apache.org/dist/ant/binaries/apache-ant-${ANT_VERSION}-bin.tar.gz.sha512 \
    # && echo "$(cat apache-ant-${ANT_VERSION}-bin.tar.gz.sha512) apache-ant-${ANT_VERSION}-bin.tar.gz" | sha512sum -c \
    && tar -zvxf apache-ant-${ANT_VERSION}-bin.tar.gz -C /opt/ \
    && ln -s /opt/apache-ant-${ANT_VERSION} /opt/ant \
    && rm -f apache-ant-${ANT_VERSION}-bin.tar.gz \
    && rm -f apache-ant-${ANT_VERSION}-bin.tar.gz.sha512

# add executables to path
RUN update-alternatives --install "/usr/bin/ant" "ant" "/opt/ant/bin/ant" 1 && \
    update-alternatives --set "ant" "/opt/ant/bin/ant" 

RUN sed -i 's/archive.ubuntu.com/tw.archive.ubuntu.com/g' \
    /etc/apt/sources.list

RUN wget https://www.apachefriends.org/xampp-files/7.0.5/xampp-linux-x64-7.0.5-0-installer.run
RUN chmod +x xampp-linux-x64-7.0.5-0-installer.run
RUN ./xampp-linux-x64-7.0.5-0-installer.run
RUN rm xampp-linux-x64-7.0.5-0-installer.run
RUN mv /opt/lampp/etc/extra/httpd-xampp.conf /opt/lampp/etc/extra/httpd-xampp.conf.bak
RUN echo "export PATH=\$PATH:/opt/lampp/bin/" >> /root/.bashrc
RUN echo "export TERM=dumb" >> /root/.bashrc
ADD httpd-xampp.conf /opt/lampp/etc/extra/httpd-xampp.conf
VOLUME  ["/opt/lampp/htdocs/"]

# expose the ports that will be used by xampp
# uncomment line below to expose port for XAMPP service
# EXPOSE 80 443 3306

RUN echo "/opt/lampp/lampp start && tail -F /opt/lampp/logs/error_log" > xampp.sh
RUN chmod +x xampp.sh

WORKDIR /

COPY abs-microservices-master/abs-microservices-master/framework framework

WORKDIR /framework


# required by the backend
RUN mkdir external

RUN mv build.bat build.sh
RUN sed -i '/pause/d' build.sh
RUN chmod +x build.sh
RUN chmod +x run.sh


# Install the needed tools for installung apache ant & xampp
# RUN apt-get install -y supervisor && \
# 	rm -rf /var/lib/apt/lists/*

# RUN mkdir -p /var/log/supervisor
# COPY supervisord.conf /etc/supervisor/conf.d/supervisord.conf

# expose the port used by abs-backend
EXPOSE 8081
WORKDIR /

# Copy the SQL file for seeding
COPY abs-database.sql abs-database.sql
COPY abs-database-seed.sql abs-database-seed.sql

COPY ./start.sh /start.sh

RUN chmod +x start.sh

CMD ["sh", "start.sh"]