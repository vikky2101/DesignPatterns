package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observers = new ArrayList<>();
  private String state;

  public void setState(String state) {
    this.state = state;
    notifyAllObservers();

  }

  public void register(Observer obj) {
    this.observers.add(obj);
  }

  public void unRegister(Observer obj) {
    this.observers.remove(obj);
  }

  private void notifyAllObservers() {
    for (Observer obj : observers) {
      obj.update();
    }
  }

}
