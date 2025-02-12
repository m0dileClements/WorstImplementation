package test1prep;

public class Employee {
	String name;
	double hourly_rate; 
	double hoursperweek;
	Job job_type;
	
	public Employee (String name, Job job_type, double hourly_rate, double hoursperweek) {
		super();
		this.name = name;
		this.job_type = job_type;
		this.hourly_rate = hourly_rate;
		this.hoursperweek = hoursperweek;
	}
	
	public void set_hours(int hours) {
		this.hoursperweek = hours;
	}
	public double get_hours() {
		return hoursperweek;
	}
	public double get_rate() {
		return hourly_rate;
	}
}
