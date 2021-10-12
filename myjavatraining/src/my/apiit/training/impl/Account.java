package my.apiit.training.impl;

import java.time.LocalDate;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * data-member
	 */
	public long number;
	public double balance;
	public LocalDate dateCreated;

	/**
	 * + deposit(double) : void
	 */
	public void deposit( double amount ) {
		this.balance += amount;
	}
	
	/**
	 * + withdraw(double) : void
	 */
	public void withdraw( double amount ) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		StringBuilder objText = new StringBuilder(">>> Account details");
		objText.append( "\nAcc #: " + number );
		objText.append( "\nBalance: "+ balance );
		objText.append( "\nDateCreated: " + dateCreated );
		return objText.toString();
	}
	
	@Override
	public boolean equals(Object next) {
		Account next_acc = (Account)next;
		return next_acc.number == this.number;
	}
	
}
