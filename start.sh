#!bin/bash

if [ $BUILD == "true" ]; then
    rm .built
fi

file="/.built"
built=true
if [ ! -f "$file" ]; then
    touch .built
    built=false
fi

echo "[start.sh] Running XAMPP..."
sh /tmp/xampp.sh &
sleep 2
echo "[start.sh] Running XAMPP... <DONE>"
echo "[start.sh] ====================="

if [ "$built" = false ]; then
    echo "[start.sh] Creating new database..."
    /opt/lampp/bin//mysql <abs-database.sql
    echo "[start.sh] Creating new database... <DONE>"
    echo "[start.sh] ====================="

    echo "[start.sh] Building the app..."
    cd /framework
    sed -i '/administrator=/s/$/, '${EMAIL}'/' auth.properties
    sed -i '/manager=/s/$/, '${EMAIL}'/' auth.properties
    sed -i '/operator=/s/$/, '${EMAIL}'/' auth.properties
    sed -i 's/^client_id=.*$/client_id='${GOOGLE_CLIENTID}'/' auth.properties
    echo "[start.sh] Building the app... <DONE>"
    echo "[start.sh] ====================="

    echo "[start.sh] Building the app..."
    rm ./lib/app.jar
    sh build.sh
    echo "[start.sh] Building the app... <DONE>"
    echo "[start.sh] ====================="

    echo "[start.sh] Seeding the database..."
    cd /
    /opt/lampp/bin//mysql <abs-database-seed.sql
    echo "[start.sh] Seeding the database... <DONE>"
    echo "[start.sh] ====================="
fi

echo "[start.sh] Running the app..."
cd /framework
sh run.sh
