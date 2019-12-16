package composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Manager implements IEmployee {

  String name;
  int salary;
  List<IEmployee> employeeList;

  public Manager(String name, int salary) {
    this.name = name;
    this.salary = salary;
    employeeList = new LinkedList<>();
  }

  @Override
  public void addEmployee(IEmployee emp) {
    employeeList.add(emp);
  }

  @Override
  public void removeEmployee(IEmployee emp) {
    employeeList.remove(emp);
  }

  @Override
  public String getName() {
    return this.name;

  }

  @Override
  public int getSalary() {
    return this.salary;

  }

  @Override
  public void showAllEmployees() {
    Iterator<IEmployee> itr = employeeList.iterator();
    while (itr.hasNext()) {
      IEmployee emp = itr.next();
      System.out.println("Name:" + emp.getName() + " Salary:" + emp.getSalary());
    }

  }

}
