DROP TABLE IF EXISTS contact;
CREATE TABLE contact(CONTACT_ID INT auto_increment PRIMARY KEY, firstname VARCHAR(255),lastname VARCHAR(255),Address VARCHAR(255),isFreelance VARCHAR(1),tvaNumber VARCHAR(255));
INSERT INTO contact(firstname,lastname,Address,isFreelance,tvaNumber) VALUES( 'Alexandre', 'bros', 'rue de tagada', 't', 'BE856965');
INSERT INTO contact(firstname,lastname,Address,isFreelance,tvaNumber) VALUES( 'ama', 'sau', 'rue de chanti', 'f', '');