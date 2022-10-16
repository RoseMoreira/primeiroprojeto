CREATE DATABASE voelight;

USE voelight;

CREATE TABLE Permissoes 
( 
 id_permissao INT PRIMARY KEY AUTO_INCREMENT,  
 tipo_permissao VARCHAR(20) NOT NULL
); 

CREATE TABLE Cliente 
( 
 id_cliente INT PRIMARY KEY AUTO_INCREMENT,  
 nome_cliente VARCHAR(50) NOT NULL,  
 email_cliente VARCHAR(50) NOT NULL,  
 senha_cliente INT NOT NULL,  
 idPermissoes INT,  
 idPassagem INT
); 

CREATE TABLE Passagem 
( 
 id_passagem INT PRIMARY KEY AUTO_INCREMENT,  
 data_passagem DATE NOT NULL,  
 duracao_passagem INT NOT NULL,  
 valor_passagem FLOAT NOT NULL,  
 cidade_passagem VARCHAR(20) NOT NULL,  
 pais_passagem VARCHAR(20) NOT NULL 
); 

