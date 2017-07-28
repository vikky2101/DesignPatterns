package visitor;

public class Food extends Item {

	private int price;

	public Food(int price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public double  accept(IVisitor visitor) {
		return visitor.visit(this);
	}
}
