CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50),
 telefone varchar(11), email varchar(40) unique);
 
 INSERT INTO  cliente(nome,telefone,email) VALUES('Adriano','232232','A@gmail.com'),
 												 ('Adriana','232232','A@gmail.com'),
 												 ('Catarina','232232','A@gmail.com');