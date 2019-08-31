package a1;

import java.util.Scanner;



public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		int count = Integer.parseInt(scan.next());
		//String str1 = scan.nextLine();
		String[] names = new String[count];
		float[] groceries_costs = new float[count];
		
		for (int i=0; i<names.length; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int num_of_items = Integer.parseInt(scan.next());
			//String[] first_last_qty = name_qty.split(" ");
			//int num_of_items = Integer.parseInt(first_last_qty[2]);
			names[i] = first_name.charAt(0)+". "+last_name;
			
			float total = 0;
			for(int j=0; j<num_of_items; j++) {
				int amount = Integer.parseInt(scan.next());
				String food = scan.next();
				float price = Float.parseFloat(scan.next());
				//String[] amount_then_cost = amount_cost.split(" ");
				
				//int amount = Integer.parseInt(amount_then_cost[0]);
				
				total += amount*price;
				groceries_costs[i] = total;
			}
		
		}
		scan.close();
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i] + ": "+String.format("%.02f",groceries_costs[i]));
		}
		
	}
}
