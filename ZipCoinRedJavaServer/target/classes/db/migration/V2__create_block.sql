CREATE TABLE BLOCK(
	ID INT AUTO_INCREMENT,
	BLOCK_NUMBER INT,
	PREVIOUS_HASH VARCHAR(255),
	NONCE INT,
	CURRENT_HASH VARCHAR(255),
	TRANSACTION_LIST VARCHAR(2000)
);

CREATE TABLE WALLET();