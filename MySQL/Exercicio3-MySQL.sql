-- criar um banco de dados

create database banco_escola;

-- acesso ao banco de dados

use banco_escola;

-- criando uma tabela

create table banco_escola(
id bigint(5) auto_increment,
nome varchar(255) not null,
idade int not null,
genero varchar (255) not null,
nota int not null,
aprovacao boolean not null,
primary key(id)
);

select * from banco_escola;

insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Maria",10,"Feminino",5,false);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("José",8,"Masculino",6,false);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Fernando",8,"Masculino",8,true);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Eduarda",10,"Feminino",10,true);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Carolina",11,"Feminino",7,true);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Felipe",11,"Masculino",9,true);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Larissa",10,"Feminino",8,true);
insert into banco_escola (nome,idade,genero,nota,aprovacao) values ("Daniel",10,"Masculino",7,false);

select * from banco_escola where aprovacao > 7;
select * from banco_escola where aprovacao < 7;

update banco_escola set nota = 8 where id = 1;