package command;

public class Client {

	public static void main(String args[]){
		IReceiver receiver = new WindowsFileReceiver();
		ICommand command = new OpenCommand(receiver);
		Invoker invoker =  new Invoker(command);
		invoker.execute();
		receiver = new UnixFileReceiver();
		command = new OpenCommand(receiver);
		invoker =  new Invoker(command);
		invoker.execute();
		
	}
}
