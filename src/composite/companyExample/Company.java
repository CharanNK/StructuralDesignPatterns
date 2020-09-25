package composite.companyExample;
import java.util.*;

interface Employee{
	public void showEmployeeDetails();
}

class Developer implements Employee{

	private String name, role;
	
	public Developer(String name,String role) {
		this.name = name; this.role = role;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name+" "+role);
	}
	
}

class Manager implements Employee{

	private String name, role;
	
	public Manager(String name,String role) {
		this.name = name; this.role = role;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name+" "+role);
	}
}

class CompanyDirectory implements Employee{

	private List<Employee> employeeList = new ArrayList<Employee>(); 
	
	@Override
	public void showEmployeeDetails() {
		for(Employee emp : employeeList)
			emp.showEmployeeDetails();
	}
	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
	
}

public class Company {
	public static void main(String[] args) {
		Developer dev1 = new Developer("charan", "se");
		Developer dev2 = new Developer("Shashank", "se");
		CompanyDirectory devs = new CompanyDirectory();
		devs.addEmployee(dev1);
		devs.addEmployee(dev2);
		
		Manager man1 = new Manager("geetika", "manager");
		CompanyDirectory managers = new CompanyDirectory();
		managers.addEmployee(man1);
		
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(managers);
		directory.addEmployee(devs);
		
		directory.showEmployeeDetails();
	}
}
