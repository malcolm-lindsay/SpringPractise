package com.qa.persistence.domain;

public class Account {

	private int accountID;
	private String firstName;
	private String lastName;
	private String AccountNumber;

	public Account() {
	}

	public Account(int accountID, String firstName, String lastName, String accountNumber) {
		super();
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		AccountNumber = accountNumber;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

}
