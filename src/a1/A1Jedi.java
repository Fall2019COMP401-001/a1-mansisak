package a1;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = Integer.parseInt(scan.next());
		//initialze dictionary {item name: amount of that item bought in total}
		Dictionary item_amount = new Hashtable();
		//initialize dictionary {item name: # of ppl who bought that item}
		Dictionary item_pplWhoBought = new Hashtable();
		//list of groceries:
		String[] groceries = new String[count];
		
		//initially populate both dicts with item names
		for (int i=0; i<count; i++) {
			String food = scan.next();
			float price = Float.parseFloat(scan.next());
			groceries[i]=food;
			item_amount.put(food, 0);
			item_pplWhoBought.put(food, 0);
		}
		
		int num_of_people = Integer.parseInt(scan.next());
		
		
		//update #of items bought/ total ppl who bought a certain type of item in corresponding dict
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
		
		//print output in correct format
		for(int i=0; i<count; i++) {
			if((int)item_amount.get(groceries[i])==0) {
				System.out.println("No customers bought "+groceries[i]);
			}
			else {
				System.out.println(item_pplWhoBought.get(groceries[i])+" customers bought "+item_amount.get(groceries[i])+" "+groceries[i]);
			}
		}
		
		
	}
}
