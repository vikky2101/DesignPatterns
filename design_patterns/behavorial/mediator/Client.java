package mediator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Chat chat = new Chat();
     IUser a = new User(chat, "A");
     IUser b = new User(chat, "B");
     IUser c = new User(chat, "C");
     IUser d = new User(chat, "D");
     chat.addMember(a);
     chat.addMember(b);
     chat.addMember(c);
     chat.addMember(d);
     a.send("Hi all");
     
		
		
	}

}
