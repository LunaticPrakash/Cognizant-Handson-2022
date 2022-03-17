SELECT car_id, COUNT(car_id) AS NO_OF_TRIPS
FROM rentals
GROUP BY car_id
ORDER BY car_id;