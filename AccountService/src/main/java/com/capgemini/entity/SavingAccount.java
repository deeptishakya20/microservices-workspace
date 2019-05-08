package com.capgemini.entity;
import javax.persistence.InheritanceType;

import javax.persistence.Inheritance;

@Inheritance(strategy = InheritanceType.JOINED)
public class SavingAccount extends BankAccount {
	
	private boolean salary;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	public SavingAccount(String accountHolderName, String accountType, double accountBalance, boolean salary) {
		super( accountHolderName, accountType, accountBalance);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}





	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingAccount [salary=" + salary + "]";
	}
	
	
	
	

}