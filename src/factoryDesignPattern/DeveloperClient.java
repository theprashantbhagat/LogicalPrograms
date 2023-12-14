package factoryDesignPattern;

public class DeveloperClient {

	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee("AndroidDeveloper");
		System.out.println(employee);
		int salary = employee.salary();
		System.out.println("salary: "+salary);
		
		
		Employee employee2 = EmployeeFactory.getEmployee("WebDeveloper");
		int salary2 = employee2.salary();
		System.out.println("WebDeveloper salary: "+salary2);
	}
}
