package my.apiit.training.equality;

public class Employee extends Object{

	private int empID;
	private String empName;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	/**
	 * REQ: Compare Employee objects by the empID.
	 */
	
	@Override
	public boolean equals(Object another) {
		
		boolean result = false;
		
		if( another instanceof Employee ) //another object is-a-kind-of Employee obj
		{
			Employee anotherEmpObj = (Employee)another; //explicit-casting (downcasting).
			if( anotherEmpObj.getEmpID() == this.getEmpID() )
				result = true;
		}
		
		return result;
		
	}
	
}
