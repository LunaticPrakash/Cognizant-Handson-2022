CREATE OR REPLACE
PROCEDURE insert_credit(
credit_id IN credit_card.id%TYPE,
credit_card_number IN credit_card.card_number%TYPE,
credit_card_expire IN credit_card.card_expire%TYPE,
holder_name IN credit_card.name%TYPE,
card_type IN credit_card.cc_type%TYPE) AS
BEGIN
INSERT INTO credit_card(id,card_number,card_expire,name,cc_type)
VALUES(credit_id,credit_card_number,credit_card_expire,holder_name,card_type);
END insert_credit;
/