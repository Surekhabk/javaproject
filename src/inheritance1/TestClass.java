package inheritance1;

public class TestClass {
	public static void main(String[] args) {
		
	
	
	
	
	KingsWay kw= new KingsWay();
	
	kw.Cardiology();
	kw.Dental();
	kw.Hepitities();
	kw.Nephro();
	kw.Ortho();
	kw.parkinsons();
	kw.Alzeimer();
	kw.Cancer();
	kw.Diabetes();
	
	
	
	USMedicalAssociation usa= new KingsWay();
	
	usa.Dental();
	usa.Ortho();
	
	
	
	UKMedicalAssociation uk= new KingsWay();
	
	uk.parkinsons();
	uk.Hepitities();
	
	SLMedicalAssociation sl=new KingsWay();
	
	sl.Cardiology();
	sl.Nephro();
	
	//KingsWay ki= new USMedicalAssociation();
	
	//USMedicalAssociation.minFees=890;
	
	System.out.println(USMedicalAssociation.minFees);
	USMedicalAssociation.Neurology();
	}
	
}
