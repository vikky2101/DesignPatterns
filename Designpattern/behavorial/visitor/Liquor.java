package visitor;

public class Liquor extends Item{

	int price;
	public Liquor(int price) {
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
