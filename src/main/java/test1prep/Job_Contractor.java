package test1prep;

public class Job_Contractor implements Job {

	@Override
	public double pay(double hourly_rate, double hours_worked) {
		return hourly_rate * hours_worked; 
	}

}