package my.apiit.training.basic.pk1;

public class ModifierDemo 
{

	//package-private (default)
	int i1;
	public int i2;
	private int i3;
	protected int i4; //concerning with the inheritance relationship
	
	//method
	private int m1() {
		return i1+i2+i3+i4;
	}
	
}
