package session5assignment4;

//overriding 
class bank{
	public void getRateOfInterest(){
		System.out.println("The rate of interest for banks vary");
	}
}
class SBI extends bank{
	@Override
	public void getRateOfInterest() {
		//overriding the getRateOfInterest method in parent class
		super.getRateOfInterest();
		System.out.println("SBI rate of interest is 8 %");
	}
}
class ICICI extends bank{
	@Override
	public void getRateOfInterest() {
		//overriding the getRateOfInterest method in parent class
		System.out.println("");

		super.getRateOfInterest();
		System.out.println("ICICI bank rate of interest is 7 %");
	}
}
class AXIS extends bank{
	@Override
	public void getRateOfInterest() {
		//overriding the getRateOfInterest method in parent class
		System.out.println("");

		super.getRateOfInterest();
		System.out.println("AXIS bank rate of interest is 9 %");
	}
	
}		// end of inheritance for overriding
public class sess5assign4 {

	public static void main(String[] args) {
		//object for SBI bank
		SBI stateBank = new SBI();
		stateBank.getRateOfInterest(); //prints out rate of interest offered by SBI
		
		//object for ICICI bank
		ICICI indianBank = new ICICI();
		indianBank.getRateOfInterest(); //prints out rate of interest offered by ICICI bank
		
		//object for AXIS bank
		AXIS indBank = new AXIS();
		indBank.getRateOfInterest(); //prints out rate of interest offered by AXIS bank

	}

}
