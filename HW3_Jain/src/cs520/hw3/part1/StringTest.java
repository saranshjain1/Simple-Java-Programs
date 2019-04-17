package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {
	
	public static void main(String[] args) {

		String t = JOptionPane.showInputDialog("Enter data using the format Name,Age,City");
		
		// if user enters cancel then we gracefully return from this program
		if (t == null) {
			return;
		}
		
		// trim the input to remove spaces
		t = t.trim();
		
		// print data to console
		System.out.println(t);
		
		// find first comma index, it will also be the length of our name
		Integer first_index = t.indexOf(",");
		
		// handle the error when there is no comma present in the string
		if (first_index == -1) {
			System.out.println("No comma present in string");
			return;
		}
		
		// get the name of user
		String name = t.substring(0, first_index);
		
		// display name on the console
		System.out.println("First Comma Position: "+first_index+", Name: "+name+", Length: " + first_index);
		
		// get the second index of comma
		Integer second_index = t.indexOf(",", first_index+1);
		
		// handle the error when there is no second comma present in the string
		if (second_index == -1) {
			System.out.println("No comma present after the first index in string");
			return;
		}
		
		// get age substring
		String age = t.substring(first_index+1, second_index);
					
		// get age in 10 years from now
		try {
			Integer age_in_10_years = Integer.parseInt(age) + 10;
			
			// print the second index and age
			System.out.println("Second Comma Position: "+second_index+", Age: " + age);
			
			// print age in 10 years
			System.out.println("You will be "+age_in_10_years+" in 10 years from now");
		}
		catch(Exception e){
			String message = e.getMessage() + " has to be a valid integer";
			System.out.println(message);
		}
		
		// find the total length of string
		Integer length = t.length();
		
		// get the city name
		String city = t.substring(second_index+1, length);
		
		// get the city length
		Integer city_length = length - second_index - 1;
		
		// print city name and city length
		System.out.println("City:"+city+", Length: "+city_length);

	}
}
