package my.apiit.training.impl;

public class InvestmentComputer {

	//compute( double, double, int ) : double
	public double compute( double amount, double annualInterestRate, int year ) {
		double monthlyInterestRate = annualInterestRate / 12;
		double futureInvestmentValue = 
				amount * Math.pow( ( 1 + monthlyInterestRate ) , ( year*12 ) );
		return futureInvestmentValue;
	}
	
	
}
