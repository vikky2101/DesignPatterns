package observer;

public class ObserverB implements Observer {

  private Subject subject;

  public ObserverB(Subject sub) {
    this.subject = sub;
    this.subject.register(this);
  }

  @Override
  public void update() {
    // TODO Auto-generated method stub
    System.out.println("Observer B updated");
  }

}
