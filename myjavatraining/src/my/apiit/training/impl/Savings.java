package my.apiit.training.impl;

public class Savings extends Account{

	public double interestRate;
	
	public Savings() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * + calcInterest() : double
	 */
	public double calcInterest(){
		return super.balance * interestRate;
	}
	
	/**
	 * + addToBalance(double) : void
	 */
	public void addToBalance( double interest ){
		super.deposit(interest);
	}
	
	@Override
	public String toString() {
		StringBuilder objText = new StringBuilder( super.toString() );
		objText.append( "\nRate: " + interestRate );
		return objText.toString();
	}
	
}
