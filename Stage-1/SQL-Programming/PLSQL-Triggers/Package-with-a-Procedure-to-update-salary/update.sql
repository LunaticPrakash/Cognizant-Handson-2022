CREATE OR REPLACE PACKAGE emp_designation AS
PROCEDURE emp_details
  (
    ps_design    employee.designation%TYPE
  , ps_incentive NUMBER
  );
END emp_designation;
/

CREATE OR REPLACE PACKAGE BODY emp_designation AS
  PROCEDURE emp_details
    ( 
      ps_design employee.designation%TYPE
    , ps_incentive NUMBER
    ) 
  IS
  BEGIN
    UPDATE employee SET employee.salary = employee.salary + ps_incentive 
      WHERE designation = ps_design; 
    dbms_output.put_line(SQL%ROWCOUNT || ' employee(s) are updated.');
  END emp_details;
END;
/