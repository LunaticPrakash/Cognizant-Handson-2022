SELECT rental_id, car_id, customer_id, km_driven
FROM rentals
WHERE month(pickup_date) = 8 AND year(pickup_date) = 2019
ORDER BY rental_id;