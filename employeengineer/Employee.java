package employeengineer;

public abstract class Employee{
	protected int number;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY = 7000;
	
	public Employee(int number, String name, int year, String department){
		this.number = number;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	public Employee(int number, String name, int year){
		this(number, name, year, null);
	}
	
	public abstract void work();

	public double calculateSalary(){
		return year * BASE_SALARY ;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		String s = "Number:" + number + " Name:" + name + " Year:" + year + " Department:" + department ;
		return s;
	}
}