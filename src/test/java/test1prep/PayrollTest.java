package test1prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayrollTest {

	@Test
	void test() {
		Payroll payroll = new Payroll();
		Job contractor = new Job_Contractor();
		Job hourly = new Job_Hourly();
		Job salary = new Job_Salary();
		
		payroll.add_employee("Jennifer", hourly, 20, 0);
		payroll.add_employee("Leyla", salary, 10, 0);
		payroll.add_employee("Angel", contractor, 20, 0);
		assertEquals(payroll.roster[0].name, "Jennifer"); // test add_employee()
		assertEquals(payroll.num_employees, 3); 
		
		payroll.roster[0].set_hours(45);
		payroll.roster[2].set_hours(30);
		assertEquals(payroll.roster[2].hoursperweek, 30); // test set_hours()
		
		double checks[] = payroll.pay_all();
		assertEquals(checks[0], (40*20 + 5*30)); // test pay_all()
		assertEquals(checks[1], 40*10);
		assertEquals(checks[2], 30*20);
	}

}
