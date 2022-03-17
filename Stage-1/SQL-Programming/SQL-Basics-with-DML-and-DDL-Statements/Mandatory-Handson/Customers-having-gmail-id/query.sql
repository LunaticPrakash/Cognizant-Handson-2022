SELECT customer_id, customer_name, address, phone_no
FROM customers
WHERE email_id LIKE "%@gmail.com"
ORDER BY customer_id;