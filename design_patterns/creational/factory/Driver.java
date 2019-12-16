package factory;

public class Driver {

  public static void main(String[] args) {

    Database dbConn = Factory.getDBConnection("Cassandra");
    if (dbConn != null) {
      dbConn.connect();
    }
  }
}
