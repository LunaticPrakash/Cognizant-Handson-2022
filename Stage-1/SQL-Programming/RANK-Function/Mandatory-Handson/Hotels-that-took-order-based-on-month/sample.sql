--1 - Without Join
SELECT DISTINCT h.hotel_id, h.hotel_name, h.rating
FROM hotel_details h, orders o
WHERE h.hotel_id = o.hotel_id
    AND month(o.order_date) = 7
ORDER BY h.hotel_id;

--2 - Inner Join
SELECT DISTINCT hotel_details.hotel_id, hotel_name, rating
FROM hotel_details INNER JOIN orders
ON hotel_details.hotel_id = orders.hotel_id
WHERE month(order_date) = 7
ORDER BY hotel_details.hotel_id;


--3 - Natural Join
SELECT DISTINCT hotel_details.hotel_id, hotel_name, rating
FROM hotel_details NATURAL JOIN orders
WHERE month(order_date) = 7
ORDER BY hotel_details.hotel_id;