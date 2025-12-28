package ClassandObject;

public class EmployeeDetailes {

	int Empid;
	String Name;
	double Salary;
	double TotalSalary;

	public void view()
	{
		System.out.println(Empid);
		System.out.println(Name);
		System.out.println(TotalSalary);
	}
	
	public void setvalues(int e, String n, int s)
	{
		Empid = e;
		Name = n;
		Salary = s;
		TotalSalary = Salary + (0.2 * Salary) + (0.1 * Salary); //TS = Salary + 20%(HRD) + 10%(DA)
	}
}