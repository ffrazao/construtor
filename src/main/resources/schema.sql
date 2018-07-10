-- drop tables
drop table if exists elemento_tipo; 

drop table if exists elemento;

drop table if exists atributo_tipo; 

drop table if exists atributo;

drop table if exists elemento_atributo;

-- create tables
create table if not exists elemento_tipo (
	id bigint not null auto_increment,
	codigo varchar(500) not null,
	nome varchar(500) not null,
	descricao text,
	pai_id bigint,
	primary key (id),
	foreign key (pai_id) references elemento_tipo (id) on delete cascade on update cascade
);

create unique index if not exists elemento_tipo_codigo_unq on elemento_tipo (
	codigo asc
);

create index if not exists elemento_tipo_nome_idx on elemento_tipo (
	nome asc
);

create table if not exists elemento (
	id bigint not null auto_increment,
	elemento_tipo_id bigint not null,
	codigo varchar(500) not null,
	nome varchar(500) not null,
	descricao text,
	pai_id bigint,
	primary key (id),
	foreign key (elemento_tipo_id) references elemento_tipo (id) on delete cascade on update cascade,
	foreign key (pai_id) references elemento (id) on delete cascade on update cascade
);

create unique index if not exists elemento_codigo_unq on elemento(
	codigo asc
);

create index if not exists elemento_nome_idx on elemento(
	nome asc
);

create table if not exists atributo_tipo (
	id bigint not null auto_increment,
	codigo varchar(500) not null,
	nome varchar(500) not null,
	descricao text,
	pai_id bigint,
	primary key (id),
	foreign key (pai_id) references atributo_tipo (id) on delete cascade on update cascade
);

create unique index if not exists atributo_tipo_codigo_unq on atributo_tipo (
	codigo asc
);

create index if not exists atributo_tipo_nome_idx on atributo_tipo (
	nome asc
);

create table if not exists atributo (
	id bigint not null auto_increment,
	atributo_tipo_id bigint not null,
	codigo varchar(500) not null,
	nome varchar(500) not null,
	descricao text,
	pai_id bigint,
	primary key (id),
	foreign key (atributo_tipo_id) references atributo_tipo (id) on delete cascade on update cascade,
	foreign key (pai_id) references atributo (id) on delete cascade on update cascade
);

create unique index if not exists atributo_codigo_unq on atributo (
	codigo asc
);

create index if not exists atributo_nome_idx on atributo (
	nome asc
);

create table if not exists elemento_atributo (
	id bigint not null auto_increment,
	elemento_id bigint not null,
	atributo_id bigint not null,
	ordem int not null,
	valor text,
	primary key (id),
	foreign key (elemento_id) references elemento (id) on delete cascade on update cascade,
	foreign key (atributo_id) references atributo (id) on delete cascade on update cascade
);

create unique index if not exists elemento_atributo_idx on elemento_atributo (
	elemento_id, atributo_id
);

