package exceptions;

public class ArithmaticException {
	
	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int i = 9;
			
			i= i/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			e.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println("Inside catch block");
			e.printStackTrace();	
		}
		
		
		System.out.println("After Exception");
		
		
	}

}
