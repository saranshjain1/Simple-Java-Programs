package cs520.hw5;

public class Senator {
	
	// declare variables
	private String name;
	private String party;
	private String state;
	private Integer yearsInOffice;
	
	// constructor with name as an argument
	public Senator(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParty() {
		return this.party;
	}
	
	public void setParty(String party) {
		this.party = party;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getYearsInOffice() {
		return this.yearsInOffice;
	}
	
	public void setYearsInOffice(Integer years) {
		this.yearsInOffice = years;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.party + ") from "+ this.state + " has been the senator for " + this.yearsInOffice + " years";
	}

}
