package EmployeePayrollService;

public class EmployeePayrollData {

	private String name;
	private int id;
	private double salary;
	public EmployeePayrollData(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void add(EmployeePayrollData employeePayrollData) {
		
	}
	@Override
	public String toString() {
		return "EmployeePayrollData [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	

}
