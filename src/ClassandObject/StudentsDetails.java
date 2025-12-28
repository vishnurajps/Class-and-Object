package ClassandObject;

public class StudentsDetails {
	String Rollno;
	String Name;
	int Mark1;
	int Mark2;
	int Mark3;
	int Mark4;	
	int res;
	
	public void display() {
		System.out.println(Rollno);
		System.out.println(Name);
		System.out.println(res);
	}
	
	public void setvalues(String r, String n, int m1, int m2, int m3,int m4)
	{
		Rollno = r;
		Name = n;
		Mark1 = m1;
		Mark2 = m2;
		Mark3 = m3;
		Mark4 = m4;
		res = Mark1 + Mark2 + Mark3 + Mark4;
	}

	public static void main(String[] args) {
		StudentsDetails Details = new  StudentsDetails();
		Details.setvalues("EC329", "VISHNU", 100, 200, 300, 400);
		Details.display();
	}
}
