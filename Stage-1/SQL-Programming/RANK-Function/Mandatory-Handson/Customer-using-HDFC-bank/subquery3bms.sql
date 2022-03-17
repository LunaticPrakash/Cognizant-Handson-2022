--1 - Without Join
SELECT DISTINCT u.name, u.address
FROM users u, bookingdetails b
WHERE u.user_id = b.user_id
AND u.user_id NOT IN (SELECT user_id 
FROM bookingdetails WHERE name="HDFC")
ORDER BY u.name;


--2 - Inner Join
SELECT DISTINCT u.name, u.address
FROM users u INNER JOIN bookingdetails b
ON u.user_id = b.user_id
AND u.user_id NOT IN (SELECT user_id 
FROM bookingdetails WHERE name="HDFC")
ORDER BY u.name;
