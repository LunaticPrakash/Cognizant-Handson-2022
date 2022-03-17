-- 1 - Without Join
SELECT s.student_name, d.department_name
FROM Student s, Department d 
WHERE s.city = "Coimbatore" AND 
s.department_id = d.department_id
ORDER BY s.student_name;


--2 - Inner Join
SELECT student_name, department_name
FROM Student INNER JOIN Department
ON Student.department_id = Department.department_id
WHERE city = "Coimbatore"
ORDER BY student_name;


--3 - Natural Join
SELECT student_name, department_name
FROM Student NATURAL JOIN Department
WHERE city = "Coimbatore"
ORDER BY student_name;