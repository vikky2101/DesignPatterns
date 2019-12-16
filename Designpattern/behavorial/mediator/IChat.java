package mediator;


public interface IChat {

  void addMember(IUser member);

  void send(String msg, IUser user);

}
