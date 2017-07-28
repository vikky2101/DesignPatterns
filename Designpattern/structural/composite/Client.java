package composite;

public class Client {

	public static void main(String[] args) {
	Developer dev  = new Developer("Ram", 300000);
	Developer dev1  = new Developer("Shyaam", 300000);
	Developer dev2  = new Developer("Mohan", 300000);
	Manager man = new Manager("Boss", 5000000);
	man.addEmployee(dev);
	man.addEmployee(dev1);
	man.addEmployee(dev2);
	man.showAllEMployees();
	

	}

}
