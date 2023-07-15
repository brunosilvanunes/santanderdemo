CREATE TABLE cliente(
    id bigint(20) NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    cpf varchar(20) NOT NULL,
    rg varchar(15) NOT NULL,

    primary key(id)
)