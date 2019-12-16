package mediator;

public class User extends IUser {

  public User(IChat chat, String name) {
    super(chat, name);
  }

  @Override
  public void send(String msg) {
    System.out.println("Msg Sent [" + msg + "] By " + this.name);
    this.chat.send(msg, this);

  }

  @Override
  public void receive(String msg) {
    System.out.println("Msg Received[ " + msg + "] By " + this.name);

  }

}
