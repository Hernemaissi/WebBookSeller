package com.wst.toni;


import javax.jws.WebService;

@WebService(endpointInterface = "com.wst.toni.BankInterface")
public class BankImplement implements BankInterface {
	private AccountContainer c;
	

	@Override
	public String transfer(String username, String password, double amount,
			String accountNum) {
		Account acc = getAccountInformation(username, password);
		if (acc == null) {
			return "No account found";
		} else {
			if (acc.getBalance() < amount) {
				return "Not enough money";
			} else {
				withdraw(amount, acc);
				return "Transfer success";
			}
		}
	}

	@Override
	public Account getAccountInformation(String username, String password) {
		if (c == null) {
			c = new AccountContainer();
		}
		return c.getAccount(username, password);
	}

	@Override
	public Account deposit(double amount, Account account) {
		Account acc = c.getAccount(account.getUsername(), account.getPassword());
		acc.setBalance(acc.getBalance() + amount);
		return acc;
	}

	@Override
	public Account withdraw(double amount, Account account) {
		Account acc = c.getAccount(account.getUsername(), account.getPassword());
		acc.setBalance(acc.getBalance() - amount);
		return acc;
	}

	@Override
	public Account createAccount(String username, String password) {
		if (c == null) {
			c = new AccountContainer();
		}
		Account acc = c.addAccount(username, password, 0);
		return acc;
	}

	

}
