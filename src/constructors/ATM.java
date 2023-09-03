package constructors;

public class ATM {
	
	int cardNo;
	int pin;
	int Amount;
	
	public ATM() {
		
		System.out.println("Non Parameterized constroctor");
	}
	
	public ATM(int cardNo, int pin, int Amount  ) {
		
		this.cardNo = cardNo;
		
		this.pin=pin;
		
		 this.Amount =  Amount;
		 System.out.println("Parameterized Constructor");
		
	}
	
	public ATM( int Amount  ) {
	
	
	this .Amount=Amount;
	
	
	
	
	public static void main(String[] args) {
		
		ATM aa = new ATM(1234,9999,2000);
		ATM aaa = new ATM(2000);
		
		
		
	}
	
	

}
