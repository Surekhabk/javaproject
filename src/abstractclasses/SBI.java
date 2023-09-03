package abstractclasses;

public abstract class SBI extends IndianArmy implements IndianNavy,IndianAirForce {
	
	int minFees=89;
	
	static final int  maxFees= 870;
	
	static int overFees=78;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SBI() {
System.out.println(" SBI ");









// sbi can make constructor 
	}
	
	
	
	public static void main(String[] args) {
		
	//	SBI sbi= new SBI();
	// we cann't make object of abstract class	
		
		//int minFees=89;
		
		static final int maxFees = 870;
	}


	
	
	
	public abstract void militaryTaz();
	
	
	public String CanteenCard() {
		return null;
		
	} 
	
	public abstract void navytax ();
	
public abstract  void airForceTax();

// we can not declair abstract method to final but non abstract method can be make a final

public final String DebitCard() {
	return null;
}

}