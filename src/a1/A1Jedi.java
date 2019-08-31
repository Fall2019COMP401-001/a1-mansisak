package a1;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = Integer.parseInt(scan.next());
		Dictionary item_amount = new Hashtable();
		Dictionary item_pplWhoBought = new Hashtable();
		
		for (int i=0; i<count; i++) {
			String food = scan.next();
			float price = Float.parseFloat(scan.next());
			item_amount.put(food, 0);
			item_pplWhoBought.put(food, 0);
		}
		
		int num_of_people = Integer.parseInt(scan.next());
		
		
		
		for (int j=0; j<num_of_people; j++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int num_of_items = Integer.parseInt(scan.next());
			
			String foods[] = new String[num_of_items];
			
			int index = 0;
			
			for (int k = 0; k<num_of_items; k++) {
				Integer amount = Integer.parseInt(scan.next());
				
				String food = scan.next();
				if(!Arrays.asList(foods).contains(food)) {
					foods[index] = food;
					index++;
				}
				int total = ((int)item_amount.get(food)+amount);
				item_amount.put(food, total);
			}
			for (int k = 0; k<index; k++) {
				int total = ((int)item_pplWhoBought.get(foods[k])+1);
				item_pplWhoBought.put(foods[k], total);
				
			}
		}
		
		System.out.println("amoutn of each item: "+item_amount);
		System.out.println("amoutn of ppl who bought each item: "+item_pplWhoBought);
		
		
	}
}
