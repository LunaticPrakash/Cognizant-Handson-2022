BEGIN

update Department

set LOCATION_ID = 'HQ-BLR-101'

where LOCATION_ID like 'HQ%';

END;
/