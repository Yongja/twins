--<ScriptOptions statementTerminator=";"/>

CREATE TABLE users (
	id VARCHAR(10) NOT NULL,
	name VARCHAR(20) NOT NULL,
	password VARCHAR(10) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

