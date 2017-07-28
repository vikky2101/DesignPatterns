package visitor;

import java.security.PublicKey;

public class Car extends Item {

	int price;
	public Car(int price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	public double accept (IVisitor visitor){
	     return visitor.visit(this);   
		}

}
