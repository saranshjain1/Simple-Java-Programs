package cs520.hw2.part2;

public class BankCD {
	
	public String bankName;
	public Integer initialDeposit;
	public double rate;
	public Integer numberOfYears;
	
	BankCD(String bankName){
		this.bankName = bankName;
	}
	
	public void setInitialDeposit(Integer deposit) {
		this.initialDeposit = deposit;
	}
	
	public void setRate(double rate) {
		this.rate = rate / 100;
	}
	
	public void setNumberOfYears(Integer years) {
		this.numberOfYears = years;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public Integer getInitialDeposit() {
		return this.initialDeposit;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public Integer getNumberOfYears() {
		return this.numberOfYears;
	}
	
	public double getFinalValue() {
		
		double finalValue;
		
		finalValue = this.initialDeposit * (Math.pow(1 + this.rate, this.numberOfYears));
		
		return finalValue;
	}
	
	public void printCDDetails() {
		
		double finalValue = getFinalValue();
		
		System.out.println( this.bankName + " " + this.numberOfYears + "-" + "year CD of " + this.initialDeposit + " at " + this.rate * 100  + "% is worth $" + String.format("%.2f", finalValue));
		
	}
}
