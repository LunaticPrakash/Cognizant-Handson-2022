-- By Using Join

SELECT DISTINCT h.hotel_id, h.hotel_name, h.hotel_type
FROM hotel_details h LEFT JOIN orders o
ON h.hotel_id = o.hotel_id
WHERE h.hotel_id NOT IN (SELECT hotel_id from orders WHERE order_date LIKE "2019-05-%")
ORDER BY h.hotel_id;


-- Without using Join

SELECT HOTEL_ID,HOTEL_NAME,HOTEL_TYPE FROM HOTEL_DETAILS
WHERE HOTEL_ID NOT IN 
(SELECT HOTEL_ID FROM ORDERS
WHERE MONTH(ORDER_DATE) = 5
AND YEAR(ORDER_DATE) = 2019)
ORDER BY HOTEL_ID ASC;