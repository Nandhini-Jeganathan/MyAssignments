package org.department;
import org.college.College;

public class Department extends College {
   public void deptName()
		{
			System.out.println("CSE");
			System.out.println("EEE");
			System.out.println("MECH");
			System.out.println("ECE");
			
		}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Department input=new Department();
			input.collegeCode();
			input.collegeName();
			input.collegeRank();
			input.deptName();
       }
 }
