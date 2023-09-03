package abstractclasses;

public class CanaraBank extends SBI{

	@Override
	public void militaryTaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navytax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void airForceTax() {
		// TODO Auto-generated method stub
	}
		
		public static void main(String[] args) {
			
		CanaraBank can = new CanaraBank();	
			
		SBI sbi = new CanaraBank();
		
		sbi.minFees=90;
		//sbi.maxFees=89;
		sbi.overFees=999;
		
		sbi.CanteenCard();
		
		
		
	}
		

}
