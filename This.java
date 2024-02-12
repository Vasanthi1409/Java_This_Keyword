package This_Keyword.com;

public class This {

	int student_Id; // class variables
	String student_Name;
	String student_Location;

	public This(int student_Id, String student_Name, String student_Location) { // parameterized constructor
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_Location = student_Location;
	}

	public void display() { // parameter named same as class variables then only we use this keyword
		System.out.println("Student Id: " + student_Id); // if we not use this keyword in constructor, then it will take delault values
		System.out.println("Student Name: " + student_Name);
		System.out.println("Student Location: " + student_Location);
	}

	public static void main(String[] args) {
		This t = new This(101, "Harish", "Chennai");
		t.display();
	}
}
