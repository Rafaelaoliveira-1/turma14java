-- criar um banco de dados
create database servico_rh;

-- acesso ao banco de dados

use servico_rh;

-- criando uma tabela

create table tabela_funcionario(
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    idade int not null,
    cpf varchar(255) not null,
	salario float not null,
    cargo varchar(255) not null,
    primary key(id)
);

select * from tabela_funcionario;

-- inserir dados na tabela
insert into tabela_funcionario (nome, idade,cpf, salario,cargo) Values ("Diego", 24,"2643668286850",2000,"Estagiário");
insert into tabela_funcionario (nome, idade,cpf, salario,cargo) Values ("Beatriz",25,"2712358825400",5000,"Desenvolvedora Java Junior");
insert into tabela_funcionario (nome, idade,cpf, salario,cargo) Values ("Allen",24, "2812312325500",5000,"Especialista");
insert into tabela_funcionario (nome, idade,cpf, salario,cargo) Values ("Luiz",26, "5012387525505",7000,"Desenvolvedora Java Pleno");
insert into tabela_funcionario (nome, idade,cpf, salario,cargo) Values ("Danilo",26, "1001231030500",10000,"Desenvolvedora Java Sênior");

select * from tabela_funcionario where salario < 2000;
select * from tabela_funcionario where salario > 2000;

update tabela_funcionario set salario = 5000 where id = 1;