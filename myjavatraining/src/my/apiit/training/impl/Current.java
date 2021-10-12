package my.apiit.training.impl;

public class Current extends Account{

	public final int tranxFee = 1; //$1 charged per-tranx
	public int freeTranx = 5; 
	public int tranx = 0;
	
	public Current() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * - handleTranx() : void
	 */
	private void handleTranx() {
		tranx++;
		if( tranx > freeTranx )
		{
			super.withdraw(tranxFee);
		}		
	}
	
	/**
	 * overriding methods: deposit and withdraw
	 */
	public void deposit( double amount ) {
		handleTranx();
		this.balance += amount;
	}
	
	public void withdraw( double amount ) {
		handleTranx();
		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		StringBuilder objText = new StringBuilder( super.toString() );
		objText.append( "\nTranx fee: " + tranxFee );
		objText.append( "\nFree transaction #: " + freeTranx );
		objText.append( "\nTranx peformed: " + tranx );
		return objText.toString();
	}
	
}
