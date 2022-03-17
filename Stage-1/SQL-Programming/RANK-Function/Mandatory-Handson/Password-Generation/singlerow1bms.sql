SELECT name, CONCAT(LEFT(name,3), LEFT(phno,3)) AS password
FROM users
ORDER BY name;

SELECT name, CONCAT(SUBSTR(name,1,3), SUBSTR(phno,1,3)) AS password
FROM users
ORDER BY name;