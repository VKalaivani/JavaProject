package face.book.login;

public class StudentDetails {
	public void studentId() {
		System.out.println("Enter Stu Id");
	}
	public void studentName() {
		System.out.println("Enter Stu Name");
	}
	public void studentMarks() {
		System.out.println("Enter Stu Marks");
	}
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.studentId();
		s.studentMarks();
		s.studentMarks();
		s.studentId();
		s.studentName();
	}
}
