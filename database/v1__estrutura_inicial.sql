-- Criação do banco de dados
create database hotel_governance_system 
default character set utf8mb4
default collate utf8mb4_general_ci;

use hotel_governance_system;

-- Tabela de status dos quartos
create table status (
id_status int not null auto_increment,
descricao varchar(50) not null,
primary key (id_status) 
) default charset utf8mb4;

-- Tabela de tipos de quarto
create table tipo_quarto (
id_tipo int not null auto_increment,
descricao varchar(70) not null,
primary key (id_tipo)
) default charset utf8mb4;

-- Tabela de modelos de quarto
create table modelo_quarto (
id_modelo int not null auto_increment,
descricao varchar(70) not null,
tem_hidromassagem boolean not null,
primary key (id_modelo)
) default charset utf8mb4;

-- Tabela de quartos
create table quartos (
id_quarto int not null auto_increment,
numero varchar(10) not null unique,
andar int not null,
tamanho varchar(5) not null,  
primary key (id_quarto)
) default charset utf8mb4;

-- Adição de colunas que serão configuradas como chaves estrangeiras
alter table quartos
add column id_status int not null;

alter table quartos
add column id_tipo int not null; 

alter table quartos
add column id_modelo int not null;

alter table quartos
add column id_status_anterior int;

-- Configuração de colunas como chaves estrangeiras
alter table quartos
add constraint fk_quarto_status
foreign key (id_status)
references status(id_status);

alter table quartos
add constraint fk_quarto_tipo
foreign key (id_tipo)
references tipo_quarto(id_tipo);

alter table quartos
add constraint fk_quarto_modelo
foreign key (id_modelo)
references modelo_quarto(id_modelo);

alter table quartos
add constraint fk_quarto_status_anterior
foreign key (id_status_anterior)
references status(id_status);

-- Cadastro dos status iniciais
insert into status (descricao) values
('Disponível'),
('Ocupado'),
('Sujo'),
('Em Limpeza'),
('Arrumação Pendente'),
('Revisão Geral'),
('Em Manutenção'),
('Manutenção Urgente'),
('Revisão Pós-Manutenção');

-- Cadastro dos tipos de quartos
insert into tipo_quarto (descricao) values
('Casal'),
('Triplo'),
('Quádruplo'),
('Quíntuplo');

-- Cadastro dos modelos dos quartos
insert into modelo_quarto (descricao, tem_hidromassagem) values
('Standard Sem Varanda', false),
('Varanda Lateral', false),
('Varanda Frente Mar', false),
('Luxo Sem Varanda', true),
('Luxo com Varanda Frente Mar', true);


-- Cadastro dos quartos da pousada
insert into quartos
(numero, andar, tamanho, id_status, id_tipo, id_modelo, id_status_anterior)
values
('02', 0, 'P', 1, 2, 1, NULL),
('03', 0, 'P', 1, 2, 1, NULL),
('04', 0, 'P', 1, 2, 1, NULL),
('05', 0, 'P', 1, 2, 1, NULL),
('101', 1, 'M', 1, 1, 2, NULL),
('102', 1, 'M', 1, 1, 2, NULL),
('103', 1, 'M', 1, 1, 2, NULL),
('104', 1, 'M', 1, 1, 2, NULL),
('105', 1, 'M', 1, 1, 2, NULL),
('106', 1, 'M', 1, 1, 2, NULL),
('107', 1, 'M', 1, 1, 2, NULL),
('108', 1, 'M', 1, 1, 3, NULL),
('109', 1, 'M', 1, 1, 3, NULL),
('110', 1, 'GG', 1, 4, 1, NULL),
('111', 1, 'GG', 1, 3, 1, NULL),
('112', 1, 'GG', 1, 3, 1, NULL),
('201', 2, 'M', 1, 1, 2, NULL),
('202', 2, 'M', 1, 1, 2, NULL),
('203', 2, 'M', 1, 2, 2, NULL),
('204', 2, 'M', 1, 2, 2, NULL),
('205', 2, 'M', 1, 2, 2, NULL),
('206', 2, 'M', 1, 2, 2, NULL),
('207', 2, 'M', 1, 2, 2, NULL),
('208', 2, 'G', 1, 1, 5, NULL),
('209', 2, 'GG', 1, 3, 1, NULL),
('210', 2, 'GG', 1, 4, 1, NULL),
('211', 2, 'GG', 1, 3, 1, NULL),
('301', 3, 'GG', 1, 4, 1, NULL),
('302', 3, 'P', 1, 2, 1, NULL),
('303', 3, 'P', 1, 1, 1, NULL),
('304', 3, 'P', 1, 1, 1, NULL),
('305', 3, 'G', 1, 1, 4, NULL),
('306', 3, 'P', 1, 1, 1, NULL),
('307', 3, 'M', 1, 2, 3, NULL),
('308', 3, 'M', 1, 2, 3, NULL),
('309', 3, 'GG', 1, 3, 1, NULL),
('310', 3, 'GG', 1, 3, 1, NULL),
('311', 3, 'GG', 1, 4, 1, NULL);

-- Validação da quantidade de quartos cadastrados
select count(*) from quartos;

-- Consulta de validação dos relacionamentos
select
    q.numero,
    q.andar,
    q.tamanho,
    s.descricao as status,
    t.descricao as tipo_quarto,
    m.descricao as modelo_quarto
from quartos q
inner join status s
    on q.id_status = s.id_status
inner join tipo_quarto t
    on q.id_tipo = t.id_tipo
inner join modelo_quarto m
    on q.id_modelo = m.id_modelo
order by q.numero;