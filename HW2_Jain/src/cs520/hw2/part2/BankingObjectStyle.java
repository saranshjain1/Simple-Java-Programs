package cs520.hw2.part2;

public class BankingObjectStyle {
	
	public static void main(String[] args) {
		
		BankCD bank1CD = new BankCD("bank1CD");
		
		BankCD bank2CD = new BankCD("bank2CD");
		
		bank1CD.setInitialDeposit(5000);
		
		bank1CD.setNumberOfYears(3);
		
		bank1CD.setRate(4);
		
		bank1CD.printCDDetails();
		
		bank2CD.setInitialDeposit(5000);
		
		bank2CD.setNumberOfYears(4);
		
		bank2CD.setRate(3);
		
		bank2CD.printCDDetails();
		
		double bank1FinalValue = bank1CD.getFinalValue();
		
		double bank2FinalValue = bank2CD.getFinalValue();
		
		if (bank1FinalValue > bank2FinalValue) {
			System.out.println( bank1CD.getBankName() + " CD exceeds " + bank2CD.getBankName() + "CD by $" + String.format("%.2f", bank1FinalValue - bank2FinalValue));
		} else if (bank1FinalValue == bank2FinalValue) {
			System.out.println( bank1CD.getBankName() + " CD is equal to " + bank2CD.getBankName() + "CD");
		} else {
			System.out.println( bank2CD.getBankName() + " CD exceeds " + bank1CD.getBankName() + " CD by $" + String.format("%.2f", bank2FinalValue - bank1FinalValue));
		}
	}
}
