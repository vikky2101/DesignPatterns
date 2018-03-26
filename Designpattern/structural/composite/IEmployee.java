package composite;


public interface IEmployee {

	public void addEmployee(IEmployee emp);
	public void removeEmployee(IEmployee emp);
	public String getName();
	public int getSalary();
	public void showAllEMployees();
	
}
