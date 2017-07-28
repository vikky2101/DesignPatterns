package factory;

public class main {

	public static void main(String[] args) {
		Database dbConn = Factory.getDBConnection("MongoDB");
		if(dbConn != null)
		dbConn.connect();

	}

}
