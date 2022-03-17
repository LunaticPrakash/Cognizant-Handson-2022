SELECT h.hotel_id, h.hotel_name, COUNT(o.hotel_id) AS NO_OF_ORDERS
FROM hotel_details h INNER JOIN orders o
ON h.hotel_id = o.hotel_id
GROUP BY o.hotel_id
HAVING NO_OF_ORDERS > 5
ORDER BY h.hotel_id;