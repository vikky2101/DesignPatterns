package mediator;

public abstract class IUser {

	protected IChat chat = null;
	protected String name = null;

	public IUser(IChat chat, String name) {
		this.chat = chat;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
