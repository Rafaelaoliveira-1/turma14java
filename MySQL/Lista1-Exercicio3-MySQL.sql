create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint (5),
categoria varchar (255) not null,
ativo boolean not null,
primary key (categoria)
);

select * from tb_categoria;

insert into tb_categoria (id, categoria,ativo) Values (1,"Genéricos", true);
insert into tb_categoria (id, categoria,ativo) Values (2,"Remédios", true);
insert into tb_categoria (id, categoria,ativo) Values (3,"Cosméticos", true);
insert into tb_categoria (id, categoria,ativo) Values (4,"Nutrição", true);
insert into tb_categoria (id, categoria,ativo) Values (5,"Mamãe e bebê", true);

create table tb_produto (
tipo_produto varchar(255) not null,
nome_produto varchar (255) not null,
preco int not null,
descricao varchar (255) not null,
primary key (nome_produto),
FOREIGN KEY (tipo_produto) REFERENCES tb_categoria (categoria)
);

insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Genéricos","Microvilar",6,"Anticonssepcional 21 ciclos genérico Microvilar");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Genéricos","Dipirona",10,"Analgésico para dor");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Genéricos","Ibuprofeno",10,"Anti-inflamatório para dor");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Remédios","Novalgina",12,"Analgésico para dor");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Remédios","NervoCalm",50,"Indicado como auxiliar no tratamento dos sintomas da ansiedade leve e insônia.");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Cosméticos","Creme para pentear",20,"Creme para pentear");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Nutrição","Vitamina Centrum",40,"Multivitamínico para todo o tipo de pessoa");
insert into tb_produto (tipo_produto,nome_produto,preco,descricao) Values ("Mamãe e bebê","Perfume Infantil",25,"Perfume hipoalergenico para bebê");

select * from tb_produto where preco > 50;
select nome_produto from tb_produto where nome_produto like ('%b%');
select * from tb_produto where preco > 3 & preco < 60;
select tb_produto.Cosméticos from tb_produto;
select * from tb_produto inner join tb_categoria on tb_categoria.categoria.nome = tb_produto.tb_categoria;
select * from tb_produto where tb_categoria = "Cosméticos";