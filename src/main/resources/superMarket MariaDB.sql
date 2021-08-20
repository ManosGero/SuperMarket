DROP DATABASE IF EXISTS sm;
CREATE DATABASE sm ; 

create table products (
    productCode int primary key,
    name varchar(50),
    bran varchar(5),
    capacity int,
    price  decimal(10,2),
    taxPersent int
);

create table orders (
    ordersCode int primary key,
    productCode int,
    quantity int,
    price  decimal(10,2),
	orderDate datetime,
    status varchar(50),
	comments varchar(100),
	employeeNumber int
);

create table employee (
	employeeNumber int primary key,
	fName varchar(50),
	lName varchar(50),
	email varchar(50),
	reportsTo int,
	jobTitle varchar(50)
	);

