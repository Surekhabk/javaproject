package conditional;

public class LogIn {
	public static void main(String[] args) {
		
		String UN= "Lucky";
		String PW= "Lucky123";
		
		if(UN.equals("Lucky")
|| PW.equals (PW)) {
			System.out.println("Allow user to login");
			
		}else if(UN.equals("Lucky")&& !PW.equals ("Lucky123"
		)){
			System.out.println("Pls input correct password");
			
		}else if(!UN.equals("Lucky")&& PW.equals ("Lucky123"
				)){
			System.out.println("our record show you are not our costomer kindly register to at stated ");
		}
				
	}

}
