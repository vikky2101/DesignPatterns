package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String args[]){
		List<Item> items = new ArrayList<>();
		items.add(new Car(50000));
		items.add(new Food(200));
		items.add(new Liquor(5000));
		TaxVisitor tax = new TaxVisitor();
		double totalTax = 0;
		for(Item item : items){
			totalTax += item.accept(tax);
		}
		System.out.println("Total Tax "+totalTax);
	}
}
