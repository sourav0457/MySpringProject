package com.src.service.impl;

public class MainClass {
	
	public static void main(String args[]){
		crud db = new crud();
		String insertQuery;
		
		String dropQuery="DROP TABLE SOURAV IF EXISTS;";
		db.insert(dropQuery);
		
		String createQuery;
				createQuery = "CREATE TABLE SOURAV " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " + 
                " PRIMARY KEY ( id ));";
		db.create(createQuery);
		
		insertQuery = "INSERT INTO SOURAV " +
          		"VALUES (1, 'Sourav');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SOURAV " +
                "VALUES (2, 'Samith');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SOURAV " +
                "VALUES (3, 'Shrey');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SOURAV " +
                "VALUES (4, 'Prakhar');";
		db.insert(insertQuery);
		insertQuery = "INSERT INTO SOURAV " +
                "VALUES (5, 'Praveen');";
		db.insert(insertQuery);
		try {
			db.selectvalues();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
