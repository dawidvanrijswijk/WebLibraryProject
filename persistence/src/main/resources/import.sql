INSERT INTO AUTHOR (FIRST_NAME, LAST_NAME) VALUES ('Czeslaw', 'Milosz');
INSERT INTO AUTHOR (FIRST_NAME, LAST_NAME) VALUES ('Witold', 'Gombrowicz');
INSERT INTO AUTHOR (FIRST_NAME, LAST_NAME) VALUES ('Adam', 'Mickiewicz');
INSERT INTO AUTHOR (FIRST_NAME, LAST_NAME) VALUES ('Henryk', 'Sienkiewicz');

INSERT INTO BORROWER_DETAILS (ADDRESS, PHONE, EMAIL) VALUES ('Prosta 2, Warszawa', '234567895', 'andrzej.kowal@gmail.com');
INSERT INTO BORROWER_DETAILS (ADDRESS, PHONE, EMAIL) VALUES ('Slowackiego 5, Krakow', '234567895', 'julia.m123@op.pl');

INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Andrzej', 'Kowalczyk', 1);
INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Julia', 'Malinowska', 2);
INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Stefan', 'Was', null);
INSERT INTO BORROWER (FIRST_NAME, LAST_NAME, BORROWER_DETAILS_ID) VALUES ('Maria', 'Raczkowska', null);

INSERT INTO BOOK(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, DESCRIPTION, TITLE, AUTHOR_ID) VALUES ('FANTASY', FALSE,'2364576896573', 345, '1994-01-01', 'A brilliant, semiautobiographical satirical novel from one of the foremost figures in twentieth-century Polish literature.', 'Trans-Atlantyk', 1);
INSERT INTO BOOK(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, DESCRIPTION, TITLE, AUTHOR_ID) VALUES ('HISTORY', FALSE,'2864576896573', 245, '1994-01-01', 'The article is an attempt at accounting for the apparent differences in meaning between the Polish word umysł and its English dictionary equivalent.', 'Zniewolony Umysl', 1);
INSERT INTO BOOK(CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, DESCRIPTION, TITLE, AUTHOR_ID) VALUES ('HISTORY', FALSE,'3164576896522', 567, '1971-06-01', 'In this bitterly funny novel by the renowned Polish author Witold Gombrowicz. a writer finds himself tossed into a chaotic world of schoolboys by a diabolical professor who wishes to reduce him to childishness. Originally published in Poland in 1937.', 'Ferdydurke', 2);