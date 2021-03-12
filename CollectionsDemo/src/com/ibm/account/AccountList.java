package com.ibm.account;

import java.util.ArrayList;
import java.util.List;


public class AccountList {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for(int i = 0; i < 10; i++) {
			Account account = new Account("Raghu" + i, i * 1100.0f);
			accounts[i] = account;
		}
		
		List<Account> accountsl = new ArrayList<Account>();
		for(Account name : accounts) {
			accountsl.add(name);
		}
		
		System.out.println(accountsl);
	}
}
