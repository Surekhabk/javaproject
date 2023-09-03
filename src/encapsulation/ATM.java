package encapsulation;

public class ATM {
	
	public int cardNo = 34578;
	int pin =0000;
	
    public int amount= 90000;
	public int cvv =998;
	
	
	public void updatepin(int cardNo,int pin, int newPin ) {
		
		if (this.cardNo==cardNo && this.pin== pin) {
			
			
			if(this.pin == pin) {
				
				setPin(newPin);
			}
			
		}
	}
	
	
	
	
	public int getCardNo() {
		return cardNo;
	}




	public int getAmount() {
		return amount;
	}




	private void setPin(int pin) {
		this.pin = pin;
	}




	public void withdrawMoney(int cardNo, int pin, int amount) {
		
		if(this.cardNo==cardNo&& this.pin==pin) {
			if(this.amount>=amount) {
				
				
				System.out.println("Withdraw Money");
				this.amount=this.amount-amount;
				
				
			}
			else {
				System.out.println("Insufficient Funds!!!!!!!!!!!");
			}
		}else {
				System.out.println("Incorrect details---Card Blocked");
			}
		}
	}
	
	
	


