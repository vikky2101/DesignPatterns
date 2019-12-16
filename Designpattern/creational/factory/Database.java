package factory;

public interface Database {

  String getDBType();

  void connect();
}
