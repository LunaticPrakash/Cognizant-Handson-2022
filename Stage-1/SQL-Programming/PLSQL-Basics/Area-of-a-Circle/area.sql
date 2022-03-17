DECLARE
pi constant number(3,2):=3.14;
Radius number(5);
Area number(7,2);
BEGIN
Radius:=3;
WHILE(Radius<=7)
LOOP
Area:= pi*power(Radius,2);
insert into circle VALUES(Radius,Area);
Radius:=Radius+1;
end LOOP;
end;
/