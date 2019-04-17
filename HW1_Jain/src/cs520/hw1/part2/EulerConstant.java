package cs520.hw1.part2;

public class EulerConstant {
	
	public static double compute(int n, Integer[] arr) {
		
		System.out.println("Computing with n = " + n);
		
		double total = 1;
		
		// iterate over n values to compute the Euler constant
		for (int i=1; i<=n; i++) {
			double x = (double)1 / (double)arr[i];
			total = total +  x;
			
			System.out.printf("Factorial of %d is %d e = %f", i, arr[i], total);
			System.out.println();
		}
		
		return total;
	}
	
	public static void main(String [] args) {
		
		// calculate the factorial of first 12 numbers 
		// and store them in an array 
		Integer arr[] = new Integer[13];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i=2; i<13; i++) {
			arr[i] = arr[i-1] * i;
		}
		
		// compute the Euler constant for 2
		double result1 = compute(2, arr);
		
		// print the Euler constant for 2
		System.out.println("result1: " + result1);
		
		// compute the Euler constant for 5
		double result2 = compute(5, arr);
		
		// print the Euler constant for 5
		System.out.println("result2: " + result2);
		
		// compute the Euler constant for 7 
		double result3 = compute(12, arr);
		
		// print the Euler constant for 7
		System.out.println("result3: " + result3);
		
		// print the difference between result2 and result1
		System.out.printf("Diff of result2 and result 1 is %.9f", result2 - result1);
		
		// put a new line
		System.out.println();
		
		// print the difference between result3 and result2
		System.out.printf("Diff of result3 and result2 is %.9f",  result3 - result2);
	}
	
}
