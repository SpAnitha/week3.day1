package week3.day1;

public class Student  {
	public void StudentName() {
		System.out.println("Anitha Sp");}
	public void Studentdept() {
		System.out.println("Computer Science");}
	public void StudentId() {
		System.out.println("Id is 3");
	}
	public static void main(String[]args) {
		College college= new College();
		Department Department= new Department();
		Student student=new Student();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		Department.deptName();
		student.StudentName();
		student.Studentdept();
		student.StudentId();
	}

}
