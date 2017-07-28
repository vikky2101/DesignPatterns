package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType){
		if(factoryType.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		else if(factoryType.equalsIgnoreCase("Color"))
			return new ColorFactory();
		else
			throw new IllegalArgumentException("No such Factory type exists");
	}
}
