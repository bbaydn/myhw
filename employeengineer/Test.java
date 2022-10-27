package employeengineer;

public class Test {

	public static void main(String[] args )throws SalaryPaidOnBankException {
  
        Employee employee = new Employee(7, "Busra", 2022, "Engineer") {
			
        @Override
		public void work() {				
			}
		};
		
		System.out.println(employee.toString());
		
        try {
             double salary = employee.calculateSalary();
             if (salary >= 10000) {
                 throw new SalaryPaidOnBankException("Payroll made with a bank account");
             }else System.out.println();
            } 
        catch (SalaryPaidOnBankException salaryPaidOnBankException) {
                System.out.println(salaryPaidOnBankException.toString());
            } 
        finally {
               
            }

    }
}