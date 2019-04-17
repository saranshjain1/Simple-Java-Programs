package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class SenatorTest {
	
	private static Queue<Senator> senatorObjects = new LinkedList<>();
	
	private static HashMap<String, Senator> senatorMap = new HashMap<String, Senator>();
	
	private static Senator processInputData(String line) {
		
		// create a new string tokenizer object with delimiter as comma
		StringTokenizer st = new StringTokenizer(line, ",");
		
		// get the first element, which is name in our case
		String name = (String)st.nextElement();
		
		// create a senator object passing name in the default constructor
		Senator currentSenator = new Senator(name);
		
		// get the second element, which is years in office in our case
		String yearsInOffice = (String)st.nextElement();
		
		// check if the years in office is a valid integer
		try {
			Integer years = Integer.parseInt(yearsInOffice);
			
			// set the years in office of the senator
			currentSenator.setYearsInOffice(years);
		} 
		catch (Exception e) {
			// catch exception and set years in office as -99
			currentSenator.setYearsInOffice(-99);
		}
		
		// get the third element, which is party in our case
		String party = (String)st.nextElement();
		
		// set the party of the senator 
		currentSenator.setParty(party);
		
		// get the fourth element, which is state in our case
		String state = (String) st.nextElement();
		
		// set the state of the senator
		currentSenator.setState(state);
		
		return currentSenator;
		
	}
	
	public static void main(String[] args) {
		
		try{
			// give the path of file.
			String path = "/Users/saransh/eclipse-workspace/HW5_Jain/src/data.txt";
			
			// use the file reader to open the file
			FileReader fr = new FileReader(path);
			
			// use buffered reader to read the contents of file
			BufferedReader br = new BufferedReader(fr);
			
			// read first line 
			String line = br.readLine();
			
			// keep reading rest of the file
			while (line != null) {
				Senator current = processInputData(line);
				// add senator to the queue
				senatorObjects.add(current);
				
				// add the senator in hashmap
				senatorMap.put(current.getName(), current);
				
				line = br.readLine();
			}
			
			// close the buffered reader
			br.close();
			
			// close file reader
			fr.close();
			
			
			// iterate over the queue and print the objects
			for (Senator current : senatorObjects) {
				System.out.println(current.toString());
			}
			
			System.out.println(" ");
			System.out.println("---------------------------");
			System.out.println(" ");
			
			// get all the keys from our map
			Set<String> keys = senatorMap.keySet();
			
			// get senator objects and print them
			for (String key : keys) {
				Senator current = senatorMap.get(key);
				System.out.println(current.toString());
			}
			
		}
		catch (Exception e) {
			// if the file is not found then notify the user
			System.out.println("Cannot find data.txt!");
		}
	}
}
