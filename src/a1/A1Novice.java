package a1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		int count = scan.nextInt();
		String str1 = scan.nextLine();
		String[] names = new String[count];
		float[] groceries_costs = new float[count];
		
		for (int i=0; i<names.length; i++) {
			String name_qty = scan.nextLine();
			String[] first_last_qty = name_qty.split(" ");
			int num_of_items = Integer.parseInt(first_last_qty[2]);
			names[i] = first_last_qty[0].charAt(0)+". "+first_last_qty[1];
			
			float total = 0;
			for(int j=0; j<num_of_items; j++) {
				String amount_cost = scan.nextLine();
				String[] amount_then_cost = amount_cost.split(" ");
				
				int amount = Integer.parseInt(amount_then_cost[0]);
				float price = Float.parseFloat(amount_then_cost[2]);
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
