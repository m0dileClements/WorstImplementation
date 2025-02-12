package test1prep;

public class Payroll {

	Employee roster[];
	int num_employees;
	 
	public Payroll() {
		num_employees = 0; // will get added one by one
		this.roster = new Employee[num_employees];
	}
	
	// Expands roster by 1 and adds new employee to the end of it
	public void add_employee(String name, Job job_type, int hourly_rate, int hoursperweek) {
		Employee rostercopy[] = new Employee[num_employees + 1];
		for (int i = 0; i < num_employees; i++) {
			rostercopy[i] = roster[i];
		}
		rostercopy[num_employees] = new Employee (name, job_type, hourly_rate, hoursperweek);
		num_employees += 1;
		roster = rostercopy;
		return;
	}
	
	// Returns an array of each employee's paid amount
	public double[] pay_all() {
		double[] paid = new double[num_employees];
		for (int i = 0; i < num_employees; i++) {
			paid[i] = roster[i].job_type.pay(roster[i].get_rate(), roster[i].get_hours());
		}
		return paid;
	}
}
