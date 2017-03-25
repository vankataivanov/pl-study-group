-- left join will select all records from the first table and 
-- from the second table, only records that match the ID's, leaving 
-- the columns from the second table empty on non matches
SELECT * FROM EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON e.DEP_ID = d.ID

-- if we wan't to exclude the matching fields and use left join
-- we add a where clause filtering the matching records.
SELECT * FROM EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON e.DEP_ID = d.ID
WHERE e.DEP_ID IS NULL

-- inner join will return only records that have matching ID's from both tables
-- (just a JOIN will do the same)
SELECT * FROM EMPLOYEE e
INNER JOIN DEPARTMENT d
ON e.DEP_ID = d.ID

-- right join will select all matching records from the first table + all records from the second table,
-- leaving empty columns on non matches.
SELECT * FROM EMPLOYEE e
RIGHT JOIN DEPARTMENT d
ON e.DEP_ID = d.ID

-- again filtering on nulls from the first table, we select all records from the second table that
-- don't match any ID in the first table
SELECT * FROM EMPLOYEE e
RIGHT JOIN DEPARTMENT d
ON e.DEP_ID = d.ID
WHERE e.DEP_ID IS NULL

-- full outer join will select everything from both tables and fill in nulls(empty records) in non matches.
SELECT * FROM EMPLOYEE e
FULL OUTER JOIN DEPARTMENT d
ON e.DEP_ID = d.ID

-- full outer join with filtering on non matches will return only rows from the first and second table
-- that don't match on ID's, filling empty columns with NULL
SELECT * FROM EMPLOYEE e
FULL OUTER JOIN DEPARTMENT d
ON e.DEP_ID = d.ID
WHERE e.DEP_ID IS NULL
OR d.ID IS NULL
