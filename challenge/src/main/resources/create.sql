DROP TABLE IF EXISTS PRODUTO;

CREATE TABLE IF NOT EXISTS PRODUTO
(
    COD_PRODUTO INT NOT NULL PRIMARY KEY,
    DES_PRODUTO VARCHAR(200),
    STA_STATUS CHAR(1)
);

INSERT INTO PRODUTO VALUES (001, 'PROD 001', 'Y');
INSERT INTO PRODUTO VALUES (002, 'PROD 002', 'Y');

DROP TABLE IF EXISTS  PRODUTO_COSIF;

CREATE TABLE IF NOT EXISTS PRODUTO_COSIF
(
    COD_PRODUTO INT NOT NULL PRIMARY KEY,
    COD_COSIF INT NOT NULL,
    COD_CLASSIFICACAO CHAR(6),
    STA_STATUS CHAR(1)
);

INSERT INTO PRODUTO_COSIF VALUES (001, 001, 'CLAS01', 'Y');
INSERT INTO PRODUTO_COSIF VALUES (002, 002, 'CLAS02', 'Y');

DROP TABLE IF EXISTS  MOVIMENTO_MANUAL;

CREATE TABLE IF NOT EXISTS MOVIMENTO_MANUAL
(
    DAT_MES NUMERIC (2, 0) NOT NULL,
    DAT_ANO NUMERIC (4, 0) NOT NULL,
    NUM_LANCAMENTO NUMERIC (10, 0) NOT NULL,
    COD_PRODUTO INT NOT NULL, --CHAR(4)
    COD_COSIF INT NOT NULL, --CHAR(11)
    DES_DESCRICAO VARCHAR(50),
    DAT_MOVIMENTO DATE,
    COD_USUARIO VARCHAR(15),
    VAL_VALOR DECIMAL(20, 2)
);