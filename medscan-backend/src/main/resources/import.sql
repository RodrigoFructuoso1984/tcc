INSERT INTO especialidade(nome) VALUES ('Cardiologista');
INSERT INTO especialidade(nome) VALUES ('Urologista');

INSERT INTO estado(nome, sigla) VALUES('São Paulo', 'SP');

INSERT INTO cidade(nome, estado_id) VALUES ('Araraquara', 1);

INSERT INTO logradouro(nome, bairro, cep, cidade_id) VALUES ('Rua Napoleão Selmi Dei', 'Vila Harmonia', '14802-500', 1 );

INSERT INTO endereco(numero_endereco, complemento_endereco, telefone_endereco, logradouro_id) VALUES ('778',null,'(16)3114-1038',1);

INSERT INTO profissional(nome, numero_conselho, especialidade_id) VALUES ('Yuri da Silva Brasil', 155274, 1);

INSERT INTO convenio(nome_convenio) VALUES ('Unimed');

INSERT INTO profissional_endereco(profissional_id, endereco_id) VALUES (1, 1);

INSERT INTO profissional_convenio(profissional_id, convenio_id) VALUES (1, 1);

INSERT INTO atendimento(data_atendimento, nota_atendimento, comentario_atendimento, profissional_id) VALUES ('2021-10-30', 10, 'Bom profissional', 1);


