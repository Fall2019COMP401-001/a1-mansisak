package a1;

import java.util.Scanner;



public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		int count = Integer.parseInt(scan.next());
		//make arrays for both customer names and they corresponding spending
		String[] names = new String[count];
		float[] groceries_costs = new float[count];
		
		for (int i=0; i<names.length; i++) {
			//populate name array with correctly formated names
			String first_name = scan.next();
			String last_name = scan.next();
			int num_of_items = Integer.parseInt(scan.next());
			names[i] = first_name.charAt(0)+". "+last_name;
			//populate cost array with total cost per customer
			float total = 0;
			for(int j=0; j<num_of_items; j++) {
				int amount = Integer.parseInt(scan.next());
				String food = scan.next();
				float price = Float.parseFloat(scan.next());
				total += amount*price;
				groceries_costs[i] = total;
			}
		
		}
		scan.close();
		//print out customer spending in correct format
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i] + ": "+String.format("%.02f",groceries_costs[i]));
		}
		
	}
}
