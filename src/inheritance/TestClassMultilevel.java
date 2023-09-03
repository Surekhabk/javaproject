package inheritance;

public class TestClassMultilevel {
	public static void main(String[] args) {
		
		Audi a= new Audi();
		
		a.price=98;
		a.getMRFTyre();
		a.getRedColor();
		a.getAutomaticGear();
		a.getBoachInfotainment();
		a.getMaroonColor();
		
		Volkswagen v = new Volkswagen();
		
		v.price = 900000000;
		v.getMRFTyre();
		v.getRedColor();
		v.getAutomaticGear();
		v.getBoachInfotainment();
		v.getMaroonColor();
		v.getAutomaticFuelCleaner();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
