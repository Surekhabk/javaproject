package overloadingconcepts;

public class OverloadingByJava {
	
	public static void main(String[] args) {
		
		 OverloadingByJava over= new OverloadingByJava();
		 over.doAddition(12,12,12,12,12);
		
		
		
		 
		 }
		
		
	
	
public void doAddition(int aa, int bb) {
	return b;
}
	
public void doAddition(int a, int b) {
	
	
}
public void doAddition(int a, double b) {
	
}
public void doAddition(double a, double b) {
	
}
public void doAddition() {
	
}
public void doAddition(int... a) {
	
	int[]b=a;
	
	int i= 0;
	for (int kk:b) {
		i=i+kk;
		
	}
	System.out.println(i);
}
}








