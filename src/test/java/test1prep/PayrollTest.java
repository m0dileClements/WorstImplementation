package test1prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayrollTest {

	@Test
	void test() {
		Payroll payroll = new Payroll();
		
		payroll.newGuy("Jennifer", "hourly", 20);
		payroll.newGuy("Leyla", "salary", 10);
		payroll.newGuy("Angel", "contractor", 20);
		assertEquals(payroll.var2[0], "Jennifer"); // test add_employee()
		assertEquals(payroll.var1, 3); 
		payroll.newGuy("fart", "salary", 10);
		payroll.newGuy("fart2", "hourly", 2);
		
		payroll.working("Jennifer", 45);
		payroll.working("Angel", 30);
		payroll.working("fart", 10);
		payroll.working("fart2", 40);
		assertEquals(payroll.var5[2], 30); // test set_hours()
		
		double checks[] = payroll.salary();
		assertEquals(checks[0], (40*20 + 5*30)); // test pay_all()
		assertEquals(checks[1], 40*10);
		assertEquals(checks[2], 30*20);
		assertEquals(checks[4], 40*2);
	}

}
