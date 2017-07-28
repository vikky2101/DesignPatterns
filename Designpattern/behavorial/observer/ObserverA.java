package observer;

public class ObserverA extends Observer {

	private Subject subject;

	public ObserverA(Subject sub) {
		this.subject = sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Observer A updated");

	}

}
