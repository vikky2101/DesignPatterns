package factory;

public class MySqlDB implements Database{

	public String getDBType(){
		return "MySQL";
	}
	
	public void connect(){
		System.out.println("MySQl DB Connection created");
	}
	
	
}
