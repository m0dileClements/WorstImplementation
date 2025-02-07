public class Person
{

	String fname;
	String lname;
	int age;
	
	public Person(String fname, String lname, int age)
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public static void main(String args[]) {
		Person f = new Person("Old", "Fart", 81);
		System.out.println("F: " + f);
	}
	
	@Override
	public String toString() {
		return "[Person] " + fname + " " + lname + " (" + age + ")";
	}

// get/set fname
	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

// get/set lname
	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

// get/set age
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
