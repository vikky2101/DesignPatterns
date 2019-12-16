package mediator;

public abstract class IUser {

	IChat chat ;
	String name ;

	public IUser(IChat chat, String name) {
		this.chat = chat;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
