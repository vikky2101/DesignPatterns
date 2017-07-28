package visitor;

public class TaxVisitor implements IVisitor {

	public TaxVisitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double visit(Liquor liqorItem) {
		// TODO Auto-generated method stub
		return 18*liqorItem.getPrice();
	}

	@Override
	public double visit(Car carItem) {
		// TODO Auto-generated method stub
		return 28*carItem.getPrice();
	}

	@Override
	public double visit(Food foodItem) {
		// TODO Auto-generated method stub
		return 15*foodItem.getPrice();
	}

}
