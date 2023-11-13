DROP table IF EXISTS trabajadores;


CREATE TABLE trabajadores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
    apellido VARCHAR(250),
    salario DOUBLE,
    trabajo enum('programador','electricista','profesor','diseñador')
);

insert into trabajadores(nombre, apellido, salario, trabajo) VALUES ('Dani', 'Nuñez Romero', 5000.50, 'programador');
insert into trabajadores(nombre, apellido, salario, trabajo) values('Pedro', 'Lopez Timo',4200.9, 'profesor');
insert into trabajadores(nombre, apellido, salario, trabajo) values('David', 'Ferna Hyio',4900,'electricista');
insert into trabajadores(nombre, apellido, salario, trabajo) values('Hector', 'Garcia Lopez',3500,'diseñador');

