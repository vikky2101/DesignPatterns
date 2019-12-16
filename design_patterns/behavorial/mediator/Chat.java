package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat{
	
	private List<IUser> users;
	
	public Chat(){
		users = new ArrayList<>();
	}
	
	@Override
	public void addMember(IUser member) {
		this.users.add(member);
		
	}

	@Override
	public void send(String msg, IUser user) {
		for(IUser u : this.users){
			if( user!=u )
				u.receive(msg);
		}
		
	}

}
