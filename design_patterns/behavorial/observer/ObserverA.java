package observer;

public class ObserverA implements Observer {

  private Subject subject;

  public ObserverA(Subject sub) {
    this.subject = sub;
    this.subject.register(this);
  }

  @Override
  public void update() {
    // TODO Auto-generated method stub
    System.out.println("Observer A updated");
  }

}
