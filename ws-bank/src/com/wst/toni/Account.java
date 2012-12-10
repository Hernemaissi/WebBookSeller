package com.wst.toni;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private String username;
	private String password;
	private double balance;

	public Account() {
		this(null, null, 0.0);
	}

	public Account(String username, String password, double balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	@XmlElement
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@XmlAttribute
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@XmlAttribute
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

