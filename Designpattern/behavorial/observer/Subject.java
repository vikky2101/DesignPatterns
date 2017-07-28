package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String state;

	public void setState(String state) {
		this.state = state;
		notifyAllObservers();

	}

	public void attach(Observer obj) {
		this.observers.add(obj);
	}

	private void notifyAllObservers() {
		for (Observer obj : observers)
			obj.update();
	}

}
