create or replace trigger trg_bie
    after insert on employee
    for each row
  begin
    dbms_output.put_line('NEW EMPLOYEE DETAILS INSERTED');
  end;
  /
