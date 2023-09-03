package inheritance;

public class TestClass {
	
	public static void main(String[] args) {
		Volkswagen v=new Volkswagen(); 
		
		v.price =90000000;
		v.getMRFTyre();
		v.getRadio();
		v.getRedColor();
		v.getAutomaticGear();
		v.getBoachInfotainment();
		v.getMaroonColor();
		
		Car c=new Car();
		c.price=90000;
		
		c.getMRFTyre();
		c.getRadio();
		c.getRedColor();
		
		
		
		
		
		
	}
	

}
