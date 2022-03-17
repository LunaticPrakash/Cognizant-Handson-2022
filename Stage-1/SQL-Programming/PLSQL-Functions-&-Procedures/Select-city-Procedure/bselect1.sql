create or replace procedure select_city
     (user_id       in number,
      city_details out varchar2                  --> no size here
     )
   as
   begin
     select case
       when city = 'Bangalore'  then
         'User is from Bangalore'
       when city = 'Chennai'    then
         'User is from Chennai'
       else
         'User is from other cities'
     end tmp_status
     into city_details
     from contact cnt
     where cnt.id = user_id;
   end;
   /