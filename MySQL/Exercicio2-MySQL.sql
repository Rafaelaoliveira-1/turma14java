-- criar um banco de dados

create database e_commerce;

-- acesso ao banco de dados

use e_commerce;

-- criando uma tabela

create table e_commerce (
id bigint(5) auto_increment,
nome varchar(255) not null,
preco float not null,
quantidade int not null,
marca varchar (255) not null,
primary key(id)
);

select * from e_commerce;

insert into e_commerce (nome,preco,quantidade,marca) values ("Porta-Retrato", 25, 5, "African Store");
insert into e_commerce (nome,preco,quantidade,marca) values ("Telefone", 60, 10, "Vivo");
insert into e_commerce (nome,preco,quantidade,marca) values ("Prato decorado", 100, 80, "Tok Stok");
insert into e_commerce (nome,preco,quantidade,marca) values ("Quadro Decorativo", 50, 10, "Tok Stok");
insert into e_commerce (nome,preco,quantidade,marca) values ("Fone de ouvido", 50, 10, "Americanas");
insert into e_commerce (nome,preco,quantidade,marca) values ("Celular Motorola", 1000, 200, "Motorola");
insert into e_commerce (nome,preco,quantidade,marca) values ("Osso grande", 15, 20, "Pet Love");
insert into e_commerce (nome,preco,quantidade,marca) values ("Caneta", 2, 50, "Bic");

select * from e_commerce where preco > 500;
select * from e_commerce where preco < 500;

update e_commerce set preco = 5 where id = 8;

delete from e_commerce where id = 8;

update e_commerce set id = 8 where id = 9;