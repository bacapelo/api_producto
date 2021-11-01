CREATE TABLE IF NOT EXISTS  client (
    id serial,
    cedula VARCHAR (10) NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NULL,
    edad VARCHAR(45) NULL,
    email VARCHAR(45) NULL,
    PRIMARY KEY (id)
);