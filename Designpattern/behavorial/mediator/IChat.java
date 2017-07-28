package mediator;


public interface IChat {

	public void addMember(IUser member);

	public void send(String msg, IUser user);

}
