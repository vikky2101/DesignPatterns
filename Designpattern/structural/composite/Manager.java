package composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Manager implements IEmployee {
	String name;
	int salary;
	List<IEmployee> emplist;

	public Manager(String name, int salary) {
		this.name = name;
		this.salary = salary;
		emplist = new LinkedList<IEmployee>();
	}

	@Override
	public void addEmployee(IEmployee emp) {
		emplist.add(emp);
	}

	@Override
	public void removeEmployee(IEmployee emp) {
		emplist.remove(emp);
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
	public void showAllEMployees() {
		Iterator<IEmployee> itr = emplist.iterator();
		while (itr.hasNext()) {
			IEmployee emp = itr.next();
			System.out.println("Name:"+emp.getName() + " Salary:"+emp.getSalary());
		}

	}

}
