DECLARE
    l_department_id  department.department_id%TYPE;
 BEGIN
    SELECT MAX (department_id) + 10 INTO l_department_id FROM department;

     INSERT INTO department (department_id, department_name, location_id)
        VALUES (l_department_id, 'TESTING', 'CHN-102');
        DELETE FROM department WHERE department_id='1040';
   END;
  /