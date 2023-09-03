package Stringsmanupulations;

public class StringManipulations {
	
	private static String spillter;
	private static String[] str;

	public static void main(String[] args) {
		
		String s1 = "Nagpur is the new IT hub of India at the Mihan in short span of time";
		String s2 = "Nagpur is the new IT hub of India at the Mihan in short span of time";
		String s3 = "Nagpur is the new It hub of India at the Mihan in short span of time";
		String s4 = "Nagpur is the  It hub of India at the Mihan in short span of time";
		//1. Lenght
	/*	System.out.println(s1.length());
	// 2. Index of
	 
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.indexOf ("the"));
		
		System.out.println(s1.indexOf('r',s1.indexOf('r')+1));
		System.out.println(s1.indexOf("the",s1.indexOf("the")+1));	*/	
				
		//3. char at
		//System.out.println(s1.charAt(10));
		//System.out.println(s1.charAt(5));
		
		
		//4.Equals and EqualsIgnoreCase
		
		
		
	/*	System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));*/
		
		// 5. Substring
		
	/*System.out.println(s1.substring(6)
		);	
System.out.println(s1.substring(11,53));	*/
		
		//6. Trim
		
		String trimers = "     Nagpur is the new IT hub of India at the Mihan in short span of time      ";
				System.out.println(trimers.trim());	
				
				//7. Replace
				
				System.out.println(trimers.replace(" ","- "));
				System.out.println(trimers.replace("of","oFF "));
				
				//8. Split
				String spllterString= "ARC_Tech_Institute_Nandanvan";
			
				String[] st= spillter.split("_");
				for(String temp:str) {
				System.out.println(temp);
				
				
				
				}
				
	}
				
				}
	


