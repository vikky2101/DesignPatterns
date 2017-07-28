package strategy;

public class main {

	public static void main(String[] args) {
		
		Context context = new Context(new AddStartegy());
		context.perform(3, 4);
		context = new Context(new MultiplyStrategy());
		context.perform(3, 4);

	}

}
