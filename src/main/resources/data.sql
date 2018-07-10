insert into elemento_tipo (codigo, nome, descricao) values ('RAIZ', 'Raíz', 'Raíz de todos os elementos do sistema');
insert into elemento_tipo (pai_id, codigo, nome, descricao) values ((select id from elemento_tipo where codigo = 'RAIZ'), 'ESTRUTURA_DADOS', 'Estrutura de Dados', 'Estruturas de Dados utilizada no sistema');

insert into elemento (elemento_tipo_id, codigo, nome, descricao) values ((select id from elemento_tipo where codigo = 'ESTRUTURA_DADOS'), 'TESTE', 'Teste', 'Teste de inclusão de estrutura de dados');

insert into atributo_tipo (codigo, nome, descricao) values ('INTEGER', 'Integer', 'Tipo de Atributo Integer');
insert into atributo_tipo (codigo, nome, descricao) values ('STRING', 'String', 'Tipo de Atributo String');

insert into atributo (atributo_tipo_id, codigo, nome, descricao) values ((select id from atributo_tipo where codigo = 'INTEGER'), 'CODIGO', 'Código', 'Código do Campo da Tabela');
insert into atributo (atributo_tipo_id, codigo, nome, descricao) values ((select id from atributo_tipo where codigo = 'STRING'), 'VALOR', 'Valor', 'Valor do Campo da Tabela');

insert into elemento_atributo (elemento_id, atributo_id, ordem) values ((select id from elemento where codigo = 'TESTE'), (select id from atributo where codigo = 'CODIGO'), 1);
insert into elemento_atributo (elemento_id, atributo_id, ordem) values ((select id from elemento where codigo = 'TESTE'), (select id from atributo where codigo = 'VALOR'), 2);

commit;