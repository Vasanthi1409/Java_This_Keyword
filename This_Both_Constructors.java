package This_Keyword.com;

public class This_Both_Constructors {
	int student_Id;
	String student_Name;
	String student_Location;

	public This_Both_Constructors() {
		this(101, "Mugilan", "Chennai");
		System.out.println("DEFAULT CONSTRUCTOR");
	}

	public This_Both_Constructors(int student_Id, String student_Name, String student_Location) {
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_Location = student_Location;
		this.display();
	}

	public void display() {
		System.out.println("Student Name: " + student_Id);
		System.out.println("Student Name: " + student_Name);
		System.out.println("Student Name: " + student_Location);
	}

	public static void main(String[] args) {

		This_Both_Constructors TBC = new This_Both_Constructors();
	}

}
