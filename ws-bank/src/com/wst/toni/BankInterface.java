package com.wst.toni;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BankInterface {
	 @WebMethod String transfer(String username, String password, double amount, String accountNum);
	 @WebMethod Account getAccountInformation(String username, String password);
	 @WebMethod Account deposit(double amount, Account account);
	 @WebMethod Account withdraw(double amount, Account account);
	 @WebMethod Account createAccount(String username, String password);
}