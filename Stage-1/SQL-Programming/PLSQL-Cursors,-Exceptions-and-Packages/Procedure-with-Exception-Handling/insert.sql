CREATE PROCEDURE CHECK_AGE_ELIGIBILITY
(
v_id IN EMPLOYEE.EMPID%TYPE,
v_name IN EMPLOYEE.EMPNAME%TYPE,
v_age IN EMPLOYEE.AGE%TYPE
)
as
in_valid_age exception;
BEGIN
if(v_age>=18) then
insert INTO EMPLOYEE VALUES(v_id,v_name,v_age);
dbms_output.put_line('Age valid - Record inserted');
else
raise in_valid_age;
end if;
EXCEPTION 
when in_valid_age
then
dbms_output.put_line('Age invalid - Record not inserted');
end;
/