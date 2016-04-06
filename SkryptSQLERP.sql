DROP SCHEMA IF EXISTS `bazaERP`;
CREATE SCHEMA IF NOT EXISTS `bazaERP` DEFAULT CHARACTER SET utf8;
USE `bazaERP`;

#
###########DROP
#
DROP TABLE IF EXISTS `bazaERP`.`logs`;
DROP TABLE IF EXISTS `bazaERP`.`employees`;
DROP TABLE IF EXISTS `bazaERP`.`positions`;
DROP TABLE IF EXISTS `bazaERP`.`emails`;
DROP TABLE IF EXISTS `bazaERP`.`repairs`;
DROP TABLE IF EXISTS `bazaERP`.`products`;
DROP TABLE IF EXISTS `bazaERP`.`categories`;
DROP TABLE IF EXISTS `bazaERP`.`orders`;


#
###########CREATE
#
CREATE TABLE IF NOT EXISTS `bazaERP`.`employees`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `name`      	VARCHAR(15) NOT NULL,
    `full_name` 	VARCHAR(30) NOT NULL,
    `email`     	VARCHAR(15) NOT NULL,
    `password`  	VARCHAR(100) NOT NULL,
    `id_position` 	INT(4) NOT NULL REFERENCES `bazaERP`.`positions`(ID),
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;



CREATE TABLE IF NOT EXISTS `bazaERP`.`positions`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `name`      	VARCHAR(20) NOT NULL,
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `bazaERP`.`emails`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `id_sender`		INT(4) NOT NULL REFERENCES `bazaERP`.`employee`(ID),
    `id_receiver` 	INT(4) NOT NULL REFERENCES `bazaERP`.`employee`(ID),
    `text` 			VARCHAR(1000) NOT NULL,
    `date` 			TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `bazaERP`.`repairs`(
	`id`       			INT(4) NOT NULL AUTO_INCREMENT,
    `id_employee`		INT(4) NOT NULL REFERENCES `bazaERP`.`employee`(ID),
    `client_name`      	VARCHAR(15) NOT NULL,
    `client_full_name` 	VARCHAR(30) NOT NULL,
    `description` 		VARCHAR(1000),
    `date` 				TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `bazaERP`.`products`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `name`      	VARCHAR(40) NOT NULL,
    `retail_price` 	DOUBLE NOT NULL,
    `vat` 			DOUBLE NOT NULL,
    `id_category` 	INT(4) NOT NULL REFERENCES `bazaERP`.`category`(ID),
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `bazaERP`.`categories`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `name`      	VARCHAR(20) NOT NULL,
    
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `bazaERP`.`orders`(
	`id`       		INT(4) NOT NULL AUTO_INCREMENT,
    `id_employee`	INT(4) NOT NULL REFERENCES `bazaERP`.`employee`(ID),
    `date` 			TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `products`		VARCHAR(1000) NOT NULL,
    `executed` 		BOOLEAN NOT NULL,
PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `bazaERP`.`logs` (
  `id` INT(4) NOT NULL AUTO_INCREMENT,
  `id_object` INT(4) NOT NULL REFERENCES `bazaERP`.`orders`(id),
  `date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `action` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


#
###########INSERT
#
INSERT INTO employees (id,name,full_name,email,password,id_position) VALUES (1,'Andrzej','Kowalski','a.kowal@wp.pl','OBXY2JIQxC2AJ/xO7bRukw==',1);
INSERT INTO employees (id,name,full_name,email,password,id_position) VALUES (2,'Mirek','Nowak','mirko@wp.pl','OBXY2JIQxC2AJ/xO7bRukw==',2); 
INSERT INTO employees (id,name,full_name,email,password,id_position) VALUES (3,'Sławek','Badura','sławko@wp.pl','OBXY2JIQxC2AJ/xO7bRukw==',3);
INSERT INTO employees (id,name,full_name,email,password,id_position) VALUES (4,'Zbyszek','Jędrzejczak','zbyszko@wp.pl','OBXY2JIQxC2AJ/xO7bRukw==',4);

INSERT INTO positions (id,name) VALUES (1,'Administrator');
INSERT INTO positions (id,name) VALUES (2,'Sprzedawca');
INSERT INTO positions (id,name) VALUES (3,'Magazynier');
INSERT INTO positions (id,name) VALUES (4,'Technik');

INSERT INTO emails (id,id_sender,id_receiver,text,date) VALUES (1,1,2,'srutututu pęczek drutu','2010-01-01 17:04:18');
INSERT INTO emails (id,id_sender,id_receiver,text,date) VALUES (2,4,1,'Siała baba mak','2010-01-01 17:04:18');

INSERT INTO repairs (id,id_employee,client_name,client_full_name,description,date) VALUES (1,1,'Antek','Franczak','Coś sie popsuło i niedziała','2010-01-01 17:04:18');
INSERT INTO repairs (id,id_employee,client_name,client_full_name,description,date) VALUES (2,1,'Jasio','Nowakowski','Trzeszczy coś','2010-01-01 17:04:18');

INSERT INTO products (id,name,retail_price,vat,id_category) VALUES (1,'NVidia GTX2',450,0.23,1);
INSERT INTO products (id,name,retail_price,vat,id_category) VALUES (2,'Super HDD',200,0.20,2);
INSERT INTO products (id,name,retail_price,vat,id_category) VALUES (3,'Kanapka ze smalcem',2,0.05,4);

INSERT INTO categories (id,name) VALUES (1,'Karty graficzne');
INSERT INTO categories (id,name) VALUES (2,'Dyski twarde');
INSERT INTO categories (id,name) VALUES (3,'Pamięć RAM');
INSERT INTO categories (id,name) VALUES (4,'Jedzenie');

INSERT INTO orders (id,id_employee,date,products,executed) VALUES (1,3,'2010-01-01 17:04:18','1,2;2,4;',false);
INSERT INTO orders (id,id_employee,date,products,executed) VALUES (2,3,'2010-01-01 17:04:18','1,3;',false);
INSERT INTO orders (id,id_employee,date,products,executed) VALUES (3,3,'2010-01-01 17:04:18','1,3;2,20;3,1;',true);
