package test1prep;

public class Job_Hourly implements Job{

	@Override
	public double pay(double hourly_rate, double hours_worked) {
		if (hours_worked <= 40) {
			return hourly_rate * hours_worked;
		} else {
			hours_worked -= 40;
			double overtime = hours_worked * hourly_rate * 1.5;
			return (hourly_rate * 40) + overtime;
		}
	} 

}
