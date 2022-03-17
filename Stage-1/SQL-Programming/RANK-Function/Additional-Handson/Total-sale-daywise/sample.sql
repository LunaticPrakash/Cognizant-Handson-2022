SELECT order_date, SUM(order_amount) AS TOTAL_SALE
FROM orders
GROUP BY order_date
ORDER BY order_date;