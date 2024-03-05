DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;

CREATE TABLE department(
departmentId INT NOT NULL AUTO_INCREMENT,
departmentName VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY (departmentId)
);


CREATE TABLE employee(
employee_id INT NOT NULL AUTO_INCREMENT,
firstname VARCHAR(255) NOT NULL,
lastname VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL UNIQUE,
salary int NOT NULL,
PRIMARY KEY (departmentId)
);

