package visitor;

public interface IVisitor {

	public double visit(Liquor liqorItem);
	public double visit(Car carItem);
	public double visit(Food foodItem);
	
}
