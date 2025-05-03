-- Inserindo imobiliárias
INSERT INTO tb_cadastro (id, nome, cnpj, telefone, cidade)
VALUES (1, 'Imobiliária Central', '00.000.000/0001-00', '11999999999', 'São Paulo');

INSERT INTO tb_cadastro (id, nome, cnpj, telefone, cidade)
VALUES (2, 'Imóveis Sul', '11.111.111/0001-11', '21988887777', 'Rio de Janeiro');

INSERT INTO tb_cadastro (id, nome, cnpj, telefone, cidade)
VALUES (3, 'Casa Norte', '22.222.222/0001-22', '31977776666', 'Belo Horizonte');

-- Inserindo casas para cada imobiliária
INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('São Paulo', 'Centro', 550000.00, 1);

INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('São Paulo', 'Jardins', 850000.00, 2);

INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('Rio de Janeiro', 'Copacabana', 1200000.00, 3);

INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('Rio de Janeiro', 'Barra da Tijuca', 950000.00, 2);

INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('Belo Horizonte', 'Savassi', 700000.00, 1);

INSERT INTO tb_casas (cidade, bairro, valor, imobiliarias_id)
VALUES ('Belo Horizonte', 'Pampulha', 620000.00, 3);
