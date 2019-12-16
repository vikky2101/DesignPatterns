package observer;

public class Driver {

	public static void main(String[] args) {
		Subject sub = new Subject();
		ObserverA a = new ObserverA(sub);
		ObserverB b = new ObserverB(sub);
		sub.setState("Stop");
    sub.unRegister(b);
    sub.setState("Start");
	}

}
