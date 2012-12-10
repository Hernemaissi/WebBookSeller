package com.wst.toni;

import java.util.HashMap;

public class AccountContainer {
	private HashMap<String, Account> accounts;
	
	public AccountContainer() {
		accounts = new HashMap<String, Account>();
		Account acc = new Account("test", "test", 0);
		accounts.put("test", acc);
	}
	
	public Account getAccount(String username, String password) {
		if (accounts.containsKey(username)) {
			Account acc = accounts.get(username);
			if (acc == null) {
				return null;
			}
			if (acc.getPassword().equals(password)) {
				return acc;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public Account addAccount(String username, String password, double amount) {
		Account acc = new Account(username, password, amount);
		accounts.put(username, acc);
		return acc;
	}
}
