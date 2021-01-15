create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_pizza(
id bigint (3),
categoria varchar (255) not null,
ativo boolean not null,
primary key (categoria)
);

select * from tb_pizza;

insert into tb_pizza (id, categoria,ativo) Values (1,"Pizza Salgada", true);
insert into tb_pizza (id, categoria,ativo) Values (2,"Pizza Doce", false);
insert into tb_pizza (id,categoria,ativo) values (3,"Esfiha Salgada", false);
insert into tb_pizza (id,categoria,ativo) values (4,"Esfiha Doce", false);
insert into tb_pizza (id,categoria,ativo) values (5,"Bebidas", true);

create table tb_categoria(
categoria_pizza varchar (255) not null,
sabor varchar (255) not null,
preco int not null,
borda_recheada boolean not null,
descricao varchar (255) not null,
primary key (sabor),
FOREIGN KEY (categoria_pizza) REFERENCES tb_pizza (categoria)
);

insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao) Values ("Pizza Salgada","Super Supreme", 50, true, "Combinação perfeita de pepperoni, cebola, champignon, pimentão, seleção de carnes bovina e suína, mussarela");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Veggie Lovers",45, true, "Muito mais pepperoni e muito mais da deliciosa mussarela Pizza Hut, sobre molho de tomate especial, fazem dessa pizza uma explosão de sabores.");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Pepperoni Lovers",40, false, "Muito mais pepperoni e muito mais da deliciosa mussarela Pizza Hut, sobre molho de tomate especial, fazem dessa pizza uma explosão de sabores");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Corn & Bacon",45, false, "Mussarela, fatias suculentas do melhor bacon e milho selecionado.");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Exclusiva - Brasileira",55, false, "Mussarela, requeijão, presunto e azeitonas verdes.");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Mussarela",30, false, "Queijo mussarela servido sobre molho de tomates especial.");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Bebidas","Coca-Cola",10, false, "Cola-Cola de dois litros.");
insert into tb_categoria (categoria_pizza,sabor,preco,borda_recheada,descricao)  Values ("Pizza Salgada","Frango com Requeijão",30, true, "Suculento frango, requeijão cremoso e a exclusiva mussarela.");

select * from tb_categoria where preco > 45;
select * from tb_categoria where preco > 29 & preco < 60;
select sabor from tb_pizza where sabor like ('%c%');
select * from tb_produto inner join tb_categoria on tb_categoria.categoria.nome = tb_produto.tb_categoria;
select * from tb_produto where tb_categoria = "Bebibas";