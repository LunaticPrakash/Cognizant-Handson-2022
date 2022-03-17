SELECT c.car_id, c.car_name, c.car_type
FROM cars c LEFT JOIN rentals r
ON c.car_id = r.car_id
WHERE c.car_id NOT IN (SELECT car_id from rentals);
;