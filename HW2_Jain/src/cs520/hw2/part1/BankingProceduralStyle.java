package cs520.hw2.part1;

public class BankingProceduralStyle {
	
	public static double calculateFinalValue(double time, double interestRate, double initialDeposit) {
		
		double finalValue;
		
		finalValue = initialDeposit * (Math.pow(1 + interestRate, time));
		
		return finalValue;
		
	}
	
	public static void main(String[] args) {
		String bankAName = "BankA";
		Integer bankAtime = 3;
		double bankARate = 4;
		double bankAinterestRate = bankARate / 100;
		
		String bankBName = "BankB";
		Integer bankBtime = 4;
		double bankBRate = 3;
		double bankBinterestRate = bankBRate / 100;
		
		Integer initialDeposit = 5000;
		
		double bankAfinalValue = calculateFinalValue(bankAtime, bankAinterestRate, initialDeposit);
		
		System.out.println(bankAName + " " + bankAtime + "-year CD of $" +  initialDeposit +  " at " + bankARate + "% rate is worth $" + String.format("%.2f", bankAfinalValue));
		
		double bankBfinalValue = calculateFinalValue(bankBtime, bankBinterestRate, initialDeposit);
		
		System.out.println(bankBName + " " + bankBtime + "-year CD of $" +  initialDeposit +  " at " + bankBRate + "% rate is worth $" + String.format("%.2f", bankBfinalValue));
		
		if (bankAfinalValue > bankBfinalValue) {
			System.out.println(bankAName + "'s CD exceeds " + bankBName + "'s CD by $" + String.format("%.2f", bankAfinalValue - bankBfinalValue));
		} else if (bankAfinalValue == bankBfinalValue) {
			System.out.println(bankAName + "'s CD is equal to " + bankBName + "'s CD");
		} else {
			System.out.println(bankBName + "'s CD exceeds " + bankAName + "'s CD by $" + String.format("%.2f", bankBfinalValue - bankAfinalValue));
		}
		
	}
}
