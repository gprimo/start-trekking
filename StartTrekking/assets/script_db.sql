CREATE TABLE IF NOT EXISTS trekking(
 id INTEGER PRIMARY KEY AUTOINCREMENT,
 nome varchar(45) NOT NULL,
 dificuldade varchar(20) NULL,
 duracao INTEGER NULL,
 nome_arquivo varchar(20) NULL,
);
