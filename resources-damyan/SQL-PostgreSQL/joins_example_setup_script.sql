﻿CREATE TABLE DEPARTMENT(
   ID INT PRIMARY KEY      NOT NULL,
   DEPT           CHAR(50) NOT NULL
);

CREATE TABLE EMPLOYEE(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL,
   DEP_ID         INT
);

INSERT INTO DEPARTMENT VALUES(1, 'Administration');
INSERT INTO DEPARTMENT VALUES(2, 'HR');
INSERT INTO DEPARTMENT VALUES(3, 'Engineering');
INSERT INTO DEPARTMENT VALUES(4, 'Marketing');
INSERT INTO DEPARTMENT VALUES(5, 'Finance');
INSERT INTO DEPARTMENT VALUES(6, 'Sales');

INSERT INTO EMPLOYEE VALUES(1, 'Paul', 32, 'California', 20000.00, 1);
INSERT INTO EMPLOYEE VALUES(2, 'Adam', 48, 'Texas', 14000.00, 2 );
INSERT INTO EMPLOYEE VALUES(3, 'Allen', 42, 'California', 18000.00, 3 );
INSERT INTO EMPLOYEE VALUES(4, 'Chanlder', 28, 'UK', 12000.00, 4);
INSERT INTO EMPLOYEE VALUES(5, 'Shauna', 27, 'Nevada', 22000.00, 2 );
INSERT INTO EMPLOYEE VALUES(6, 'Tim', 51, 'New Mexico', 23500.00, 3 );
INSERT INTO EMPLOYEE VALUES(7, 'Ken', 33, 'New York', 32000.00);
INSERT INTO EMPLOYEE VALUES(8, 'Theo', 49, 'Washington', 24500.00);
INSERT INTO EMPLOYEE VALUES(9, 'Jumbo', 29, 'Hawaii', 18000.22);
INSERT INTO EMPLOYEE VALUES(10, 'Caspian', 31, 'Alaska', 21500.00);