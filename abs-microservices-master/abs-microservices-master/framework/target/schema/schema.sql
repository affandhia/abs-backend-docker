CREATE TABLE AccountImpl (
balance            INT        DEFAULT 0,
rekening        VARCHAR(30)    DEFAULT '',
interest        INT        DEFAULT 0,
customerId        INT        DEFAULT 0,
id            INT        DEFAULT 0,
PRIMARY KEY (id));

CREATE TABLE CustomerImpl (
address            VARCHAR(30)    DEFAULT '',
phone            VARCHAR(30)    DEFAULT '',
name            VARCHAR(30)    DEFAULT '',
id            INT        DEFAULT 0,
email            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (id));



