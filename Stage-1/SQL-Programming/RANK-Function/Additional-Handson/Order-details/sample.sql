SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM customers c INNER JOIN orders o INNER JOIN hotel_details h
ON c.customer_id = o.customer_id
AND o.hotel_id = h.hotel_id
ORDER BY o.order_id;
