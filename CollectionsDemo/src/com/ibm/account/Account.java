package com.ibm.account;

public class Account {
	private String name;
	private float balance;
	
	public Account(String name, float balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "{Name : " + this.name + ", Balance : " + this.balance + "}";
	}
}
