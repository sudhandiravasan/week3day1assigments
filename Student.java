package org.student;

import org.department.Department;

public class Student extends Department  {
	private void StudentName() {
		System.out.println("Name:sudhan");
	}
public void StudentDepartment() {
	System.out.println("StudentDepartment-civil");
}
public void StudentID() {
	System.out.println("ID:ce0058");
}

public static void main(String[] args) {
	Student student = new Student();
	student.StudentName();
	student.StudentID();
	student.StudentDepartment();
	student.CollegeName();
	student.CollegeCode();
	student.CollegeRank();
	
}






}


