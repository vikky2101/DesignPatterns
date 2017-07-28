package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		
		Thread thread1 = new Thread(){
			public void run(){
				long starttime = System.nanoTime();
				Singleton instance1 = Singleton.getInstance();
				System.out.println("Instanc1:Hashcode:" + instance1.hashCode());
			    long exetime = starttime - System.nanoTime();
			    System.out.println("Threa1 start time:"+starttime);
			    System.out.println("Thread1 Exe Time:" + exetime);
			}
		};
		
		Thread thread2 = new Thread(){
			public void run(){
				long starttime = System.nanoTime();
				Singleton instance2 = Singleton.getInstance();
				System.out.println("Instanc1:Hashcode:" + instance2.hashCode());
				long exetime = starttime - System.nanoTime();
				  System.out.println("Threa2 start time:"+starttime);
				System.out.println("Thread1 Exe Time:" + exetime);

			}
		};
		
		thread1.start();
		thread2.start();
	}
	
	
	
	// Factory Design Pattern
	
	
	
	
	
	
}
