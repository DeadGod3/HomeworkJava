CREATE TABLE IF NOT EXISTS clients (
 id serial CONSTRAINT clients_pk PRIMARY KEY UNIQUE NOT NULL,
	name varchar(20),
	email varchar(255) UNIQUE NOT NULL,
	phone int UNIQUE NOT NULL,
	about varchar
);