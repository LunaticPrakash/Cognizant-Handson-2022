SELECT DISTINCT o.owner_id, o.owner_name, o.address, o.phone_no
FROM owners o INNER JOIN cars c
ON o.owner_id = c.owner_id
WHERE c.car_name LIKE "%Maruthi%"
ORDER BY o.owner_id;