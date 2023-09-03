package Loops;

public class ForLoops {
	public static void main(String[] args) {
		int[] savingAmt = new int[10];
		
		savingAmt[0]= 230000;
		savingAmt[1]= 30000;
		savingAmt[2]= 450000;
		savingAmt[3]= 10000;
		savingAmt[4]= 870000;
		savingAmt[5]= 90000;
		savingAmt[6]= 550000;
		savingAmt[7]= 70000;
		savingAmt[8]= 30000;
		savingAmt[9]= 40000;
		
		System.out.println("Lenght of Array-->+ savingAmt.length);");
		
		
		//1. traditional loop
		
		/*for(int i=0; i<savingAmt.length;i++ ) {
			
			//if(savingAmt[i]>=200000) {
			System.out.println(i);
				System.out.println("Insert to database-->"+savingAmt[i]);
		//}
		}*/
		
		System.out.println("*****************************");
				//2. For each loop
				
				//for(long r:savingAmt) {
					
					//if (r>=200000) {
				
						//System.out.println("Insert to database-->"+r);//
				//3. For loop with decrement
						for(int i = 10; i>=0; i--) {
							
							System.out.println("Insert to databas-->"+i);
						}
						
						
					}
				
				
			}
			
			
		
	


