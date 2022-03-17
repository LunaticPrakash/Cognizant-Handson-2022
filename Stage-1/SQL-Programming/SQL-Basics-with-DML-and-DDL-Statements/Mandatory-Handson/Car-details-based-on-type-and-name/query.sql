SELECT car_id, car_name, car_type
FROM cars 
WHERE car_name LIKE "Maruthi%" AND car_type="Sedan"
ORDER BY car_id;