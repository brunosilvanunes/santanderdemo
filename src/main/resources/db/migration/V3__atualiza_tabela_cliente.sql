ALTER TABLE cliente
    ADD COLUMN agencia varchar(30) NOT NULL,
    ADD COLUMN conta varchar(30) NOT NULL,
    ADD COLUMN gerente varchar(255) NOT NULL;