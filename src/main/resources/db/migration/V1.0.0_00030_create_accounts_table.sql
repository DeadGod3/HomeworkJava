CREATE TABLE IF NOT EXISTS accounts(
id serial CONSTRAINT accounts_pk PRIMARY KEY ,
client_id int NOT NULL,
number varchar(20) UNIQUE NOT NULL,
value real NOT NULL
);