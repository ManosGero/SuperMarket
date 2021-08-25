DROP DATABASE IF EXISTS sm;
CREATE DATABASE sm ; 

-- drop table employee
create table products (
    productCode int NOT NULL AUTO_INCREMENT primary key ,
    name varchar(50),
    brand varchar(50),
	category varchar(50),
    capacity int,
    price  decimal(10,2),
    taxPersent int
);

create table orders (
    ordersCode int NOT NULL AUTO_INCREMENT primary key,
    productCode int,
    quantity int,
    price  decimal(10,2),
	orderDate datetime,
    status varchar(50),
	comments varchar(100),
	employeeNumber int
);

create table employee (
	employeeNumber int NOT NULL AUTO_INCREMENT primary key,
	fName varchar(50),
	lName varchar(50),
	passwords varchar(50),
	email varchar(50),
	reportsTo int,
	jobTitle varchar(50)
	);


insert into orders (productCode,quantity, price, orderDate , status, comments, employeeNumber)
values(9,6,6,'2021-08-20 17:04:02','ok','',1)





insert into employee(fName, lName, passwords, email, reportsTo, jobTitle)
values('Μανος', 'Γεροθανάσης','admin', 'No_pli1723@gmail.com', 1,'Admin');
insert into employee(fName, lName,passwords, email, reportsTo, jobTitle)
values('Ιωάννης', 'Καποδίστριας','1234', 'test@gmail.com', 1,'User');




insert into products(name, brand, category, capacity, price, taxPersent)
values('Γαλα','Αγνο','Γάλα, αυγά και προϊόντα τους',             100,0.9,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('Σοκολάτα Γάλακτος','ΙΟΝ','Προϊόντα με γλυκαντικές ύλες', 80,1.2,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('Nescafe ','Nestle','Καφές, τσάι και προϊόντα τους',      40,4.9,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('τσάι  Βουνό','Βουνό','Καφές, τσάι και προϊόντα τους',      60,1.3,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('αυγά ','Φάρμα','Γάλα, αυγά και προϊόντα τους',           30,2.9,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('Δημητριακά  ','Nestle','Δημητριακά και προΙόντα τους',   100,3.5,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('Όσπρια','Φάρμα','Διάφορα τρόφιμα φυτικής προέλευσης',    80,1.9,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('κομπόστες ','Φάρμα','Διάφορα τρόφιμα φυτικής προέλευσης',10,1.4,10);
insert into products(name, brand, category, capacity, price, taxPersent)
values('Μπύρα ','Alpha','Ποτά διάφορα',                          100,0.9,10);
insert into products(name, brand, category, capacity, price, taxPersent)

-- update  products
-- SET  brand = 'ΙΟΝ', category='Προϊόντα με γλυκαντικές ύλες'
-- WHERE productCode = 2 ;




