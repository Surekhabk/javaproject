package staticnonstatic;

public class SNS {
	
	static int pin= 987;
	//1. Non static variable or method cannot be accessed directly into a static method
	//2.Calling Static method and variable in a static method in the same class
	public static void main(String[] args) {
		SNS tr = new SNS();
		
		tr.pin=665;
		
		SNS tr1= new SNS();
		tr1.pin=876;
		
		System.out.println(tr.pin);
		System.out.println(tr1.pin);
		
		
		
		
		
		
		
	}

	}


