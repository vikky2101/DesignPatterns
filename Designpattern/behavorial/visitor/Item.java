package visitor;

public abstract class  Item {

	public abstract double getPrice();
	public abstract double accept(IVisitor vistor);
	
	
}
