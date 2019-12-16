package singleton;

import com.sun.tools.corba.se.idl.constExpr.Not;

public class Singleton {

  private static Singleton instance = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
