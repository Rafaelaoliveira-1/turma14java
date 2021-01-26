create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

select * from tb_categoria;

insert tb_categoria (descricao, ativo) values ("Piso",true);
insert tb_categoria (descricao, ativo) values ("Revestimento",true);
insert tb_categoria (descricao, ativo) values ("Material de Construção",true);
insert tb_categoria (descricao, ativo) values ("Material Hidraulico",true);
insert tb_categoria (descricao, ativo) values ("Metal e Acessórios",true);

create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco int not null,
quantidade_Produto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Cimento",50,100,3);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Argamassa",30,100,3);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Areia",15,100,3);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Piso",15,50,1);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Revestimento Amarelo",20,200,2);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Caixa d'agua",300,100,4);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Torneira",100,100,4);
insert tb_produtos (nome, preco, quantidade_Produto, categoria_id) values ("Chuveiro",20,50,3);

select * from tb_produto where preco > 50;
select nome_produto from tb_produto where nome_produto like ('%c%');
select * from tb_produto where preco > 3 & preco < 60;

select * from tb_produto inner join tb_categoria on tb_categoria.categoria.nome = tb_produto.tb_categoria;

select * from tb_produto where tb_categoria = "Metal e Acessórios";