package EncapsulationEx;

public class Class1 {
	private int pin;
	private boolean isValidpin;
	
	public void getpin(){
		System.out.println(this.pin);
	}
	
	public void setpin(int pin) {
		
		Boolean isValid= validatepin(pin);
		if (isValid) {
			this.pin=pin;
			System.out.println(this.pin);
		}
		else
			System.out.println("Invalid Pin");
			this.pin=0;			
	}
	
	private boolean validatepin(int pin) {
		if (pin==1001 || pin ==1234 || pin ==1212) 
			isValidpin = true;
		else
			isValidpin = false;
				
		return isValidpin;
	}

}
