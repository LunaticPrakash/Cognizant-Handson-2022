SELECT car_id, car_name, owner_id
FROM cars 
WHERE car_type="Hatchback" or car_type="SUV"
ORDER BY car_id;