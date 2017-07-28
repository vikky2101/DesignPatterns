package observer;

public class Main {

	public static void main(String[] args) {
		Subject sub = new Subject();

		ObserverA a = new ObserverA(sub);
		ObserverB b = new ObserverB(sub);
		sub.setState("Stop");

	}

}
