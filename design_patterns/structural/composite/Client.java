package composite;

public class Client {

  public static void main(String[] args) {
    Developer dev = new Developer("Amar", 300000);
    Developer dev1 = new Developer("Akbar", 300000);
    Developer dev2 = new Developer("Anthony", 300000);
    Manager man = new Manager("Big Boss", 5000000);
    man.addEmployee(dev);
    man.addEmployee(dev1);
    man.addEmployee(dev2);
    man.showAllEmployees();
    man.removeEmployee(dev1);
    man.showAllEmployees();
  }
}
