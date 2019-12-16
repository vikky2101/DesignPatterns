package composite;


public interface IEmployee {

  void addEmployee(IEmployee emp);

  void removeEmployee(IEmployee emp);

  String getName();

  int getSalary();

  void showAllEmployees();

}
