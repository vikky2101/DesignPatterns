package singleton;

public class Driver {

  public static void main(String[] args) {

    Thread thread1 = new Thread() {
      public void run() {
        long startTime = System.nanoTime();
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance1:Hashcode:" + instance1.hashCode());
        long execTime =  System.nanoTime() - startTime;
        System.out.println("Thread1 start time:" + startTime);
        System.out.println("Thread1 exec Time:" + execTime);
      }
    };

    Thread thread2 = new Thread() {
      public void run() {
        long startTime = System.nanoTime();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Instance2:Hashcode:" + instance2.hashCode());
        long execTime =  System.nanoTime() - startTime;
        System.out.println("Thread2 start time:" + startTime);
        System.out.println("Thread2 exec Time:" + execTime);

      }
    };

    thread1.start();
    thread2.start();
  }

  // Factory Design Pattern


}
