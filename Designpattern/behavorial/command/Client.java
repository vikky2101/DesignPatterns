package command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String args[]){
		
		//service centres mainly uses command pattern
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
