INSERT INTO GUEST(ID, FIRST_NAME, LAST_NAME, EMAIL) VALUES (1, 'Brice', 'Argenson', 'bargenson@edgenda.com');
INSERT INTO GUEST(ID, FIRST_NAME, LAST_NAME, EMAIL) VALUES (2, 'Gregoire', 'Weber', 'gweber@cleverage.com');
INSERT INTO GUEST(ID, FIRST_NAME, LAST_NAME, EMAIL) VALUES (3, 'John', 'Doe', 'jdoe@bnc.com');

INSERT INTO EVENT(ID, NAME, DESCRIPTION, START_DATE, END_DATE, LOCATION) VALUES (1, 'DevOps Training', 'Training for NBC about DevOps principles and tools. ', '2012-09-02 18:47:52.069', '2012-09-17 18:47:52.069', '500 rue Saint-Jacques, Edifice Toronto Dominion');
INSERT INTO EVENT(ID, NAME, DESCRIPTION, START_DATE, END_DATE, LOCATION) VALUES (2, 'GCP Training ', 'Training for NBC about GCP Architecture  ', '2013-09-05 18:47:52.069', '2012-09-17 18:47:52.069', '500 rue Saint-Jacques, Edifice Toronto Dominion');


INSERT INTO INVITATION(ID, EVENT_ID, GUEST_ID, STATE) VALUES (3, 1, 1, 'ACCEPTED');