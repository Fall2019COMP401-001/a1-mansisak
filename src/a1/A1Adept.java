package a1;

import java.util.Scanner;
import java.util.*;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.next());
		Dictionary item_price = new Hashtable();
		for (int i=0; i<count; i++) {
			String food = scan.next();
			float price = Float.parseFloat(scan.next());
			item_price.put(food, price);
		}
		
		int people = Integer.parseInt(scan.next());
		String[] names = new String[people];
		float[] groceries_costs = new float[people];
		
		
		for (int j=0; j<people; j++) {
			String first_name = scan.next();
			String last_name = scan.next();
			names[j] = first_name+" "+last_name;
			int num_of_items = Integer.parseInt(scan.next());
			float total = 0;
			for (int k = 0; k<num_of_items; k++) {
				int amount = Integer.parseInt(scan.next());
				String food = scan.next();
				Float price =  (Float) item_price.get(food);
				total += amount*price;
				groceries_costs[j] = total;
			}
		}
		
		scan.close();
		float min = groceries_costs[0];
		float max = groceries_costs[0];
		int max_index = 0;
		int min_index = 0;
		String max_person = "";
		String min_person = "";
		float sum = 0;
		for (int i=0; i<names.length; i++) {
			
			if(min>=groceries_costs[i]) {
				min = groceries_costs[i];
				min_person = names[i];
			}
			if(max<=groceries_costs[i]) {
				max = groceries_costs[i];
				max_person=names[i];
			}
			sum += groceries_costs[i];
			
			
		}
		System.out.println("Biggest:"+' '+max_person+ " ("+String.format("%.02f",max)+")");
		System.out.println("Smallest:"+' '+min_person+ " ("+String.format("%.02f",min)+")");
		System.out.println("Average: "+ String.format("%.02f", sum/groceries_costs.length));
		
		
	}
}
