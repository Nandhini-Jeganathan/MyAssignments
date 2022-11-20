package org.student;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Nandhini");
	}
	public void studentDept() {
		System.out.println("Computer Science and Engineering");
	}
	public void studentId() {
		System.out.println("CSA1653");
	}

	public static void main(String[] args) {
		Student input=new Student();
		input.collegeName();
		input.collegeCode();
		input.collegeRank();
		input.deptName();
		input.studentName();
		input.studentDept();
		input.studentId();
		Department dept=new Department();
		dept.collegeName();
   }
}
