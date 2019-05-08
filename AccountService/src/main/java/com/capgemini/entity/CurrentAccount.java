package com.capgemini.entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
public class CurrentAccount extends BankAccount {

	private double odLimit;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CurrentAccount( String accountHolderName, String accountType, double accountBalance, double odLimit) {
		super( accountHolderName, accountType, accountBalance);
		// TODO Auto-generated constructor stub
		this.odLimit = odLimit;

	}



	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + "]";
	}

}