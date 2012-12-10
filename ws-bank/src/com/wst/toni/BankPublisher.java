package com.wst.toni;

import javax.xml.ws.Endpoint;

import com.wst.toni.BankImplement;

public class BankPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/WS/Bank",new BankImplement());
	}
}
