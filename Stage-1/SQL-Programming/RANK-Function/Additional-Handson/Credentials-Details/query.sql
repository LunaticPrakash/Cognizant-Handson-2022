SELECT CONCAT(owner_name, owner_id) AS USERNAME, CONCAT(SUBSTR(owner_name,1,3), owner_id) AS PASSWORD
FROM owners
ORDER BY USERNAME;