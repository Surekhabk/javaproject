package overriding;

public class TestClass  {
	
	public static void main(String[] args) {
		
		HDFCBank hdfc=new HDFCBank();
		
		System.out.println(hdfc.getHomeLoan());
		
		RBI rbi = new RBI();
		
		System.out.println(rbi.getHomeLoan());
		
		RBI u = new HDFCBank();
		
		System.out.println(u.getHomeLoan());
		
		u.getVechicleLoan();
		
		RBI uu = new AxisBank();
		System.out.println("uu.getHomeLoan");
		
		HDFC hd = new AxisBank();
		
		System.out.println(hd. gethomeLoan);
		
	}

}
