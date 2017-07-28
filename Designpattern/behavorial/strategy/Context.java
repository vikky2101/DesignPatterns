package strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void perform(int num1, int num2) {
		this.strategy.execute(num1, num2);
	}
}
