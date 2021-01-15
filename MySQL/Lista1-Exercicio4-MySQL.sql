create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

select * from tb_categoria;

insert tb_categoria (descricao, ativo) values ("Bovino",true);
insert tb_categoria (descricao, ativo) values ("Suíno",true);
insert tb_categoria (descricao, ativo) values ("Aves",true);
insert tb_categoria (descricao, ativo) values ("Frios",true);
insert tb_categoria (descricao, ativo) values ("Outros",true);

create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco int not null,
quantidade_Produto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Filé de Frango",20,10,3);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Picanha",20,30,1);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Coxa de frango",20,30,3);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Bacon",20,30,1);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Salame",15,15,4);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Fraudinha",50,50,1);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Contra-Filé",60,50,1);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Queijo",10,50,4);

select * from tb_produto where preco > 50;
select nome_produto from tb_produto where nome_produto like ('%c%');
select * from tb_produto where preco > 3 & preco < 60;