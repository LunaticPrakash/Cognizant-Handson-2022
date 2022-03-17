set serveroutput on
DECLARE
BEGIN
dbms_output.put_line('Department Names are:');
for REC IN(select DEPARTMENT_ID, DEPARTMENT_NAME , LOCATION_ID FROM DEPARTMENT order by DEPARTMENT_NAME ASC)
LOOP
dbms_output.put_line(REC.DEPARTMENT_NAME);
end LOOP;
end;
/