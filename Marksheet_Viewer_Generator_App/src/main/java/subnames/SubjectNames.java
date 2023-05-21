package subnames;

import java.util.ArrayList;

public class SubjectNames {
			
	ArrayList<String> subjectName = new  ArrayList<String>();	
	
	public ArrayList<String> getSubjectName(String sDepartment,String sBranch,String sSemester){
		
		if(sDepartment.equals("engineering") && sBranch.equals("Computer Science") && sSemester.equals("1st Semester"))
		{
				subjectName.add("OBJECT ORIENTED SYSTEM");
				subjectName.add("HIGH PERFORMANCE COMPUTER ARCHITECTURE");
				subjectName.add("ADVANCES IN OPERATING SYSTEM");
				subjectName.add("COMPUTER SYSTEM");
				subjectName.add("OBJECT ORIENTED SYSTEM [ PRACTICAL ]");
				subjectName.add("COMPUTER SYSTEM [ PRACTICAL ]");
		}else if(sDepartment.equals("engineering") && sBranch.equals("Computer Science") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("COMPUTER NETWORK");
			subjectName.add("THEORY OF COMPUTATION");
			subjectName.add("SYSTEM PROGRAMMING");
			subjectName.add("DATABASE MANAGEMENT SYSTEM");
			subjectName.add("SYSTEM PROGRAMMING [ PRACTICAL ]");
			subjectName.add("DATABASE MANAGEMENT SYSTEM [ PRACTICAL ]");
			
		}else if(sDepartment.equals("engineering") && sBranch.equals("Information Technology") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("ETHICS IN INFORMATION TECHNOLOGY");
			subjectName.add("FUNDAMENTALS OF MICROPROCESSOR");
			subjectName.add("DATA COMMUNICATION");
			subjectName.add("DATABASE MANAGEMENT SYSTEM");
			subjectName.add("FUNDAMENTALS OF MICROPROCESSOR [ PRACTICAL ]");
			subjectName.add("DATABASE MANAGEMENT SYSTEM [ PRACTICAL ]");
			
		}else if(sDepartment.equals("engineering") && sBranch.equals("Information Technology") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("COMPUTER ARCHITECTURE AND ORGANIZATION");
			subjectName.add("OBJECT ORIENTED METHODOLOGY");
			subjectName.add("ALGORITHMS AND DATA STRUCTURES");
			subjectName.add("COMPUTER SYSTEM");
			subjectName.add("COMPUTER ARCHITECTURE AND ORGANIZATION[ Practical ]");
			subjectName.add("ALGORITHMS AND DATA STRUCTURES [ Practical ]");
			
		}
		
		
		//Bachelors of Science
		else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. IT") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("COMPUTER SCIENCE");
			subjectName.add("ADVANCED DATA STRUCTURE");
			subjectName.add("DIGITAL COMPUTER FUNDAMENTAL");
			subjectName.add("COMPUTER GRAPHICS");
			subjectName.add("COMPUTER SCIENCE [ PRACTICAL ]");
			subjectName.add("ADVANCED DATA STRUCTURE [ PRACTICAL ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. IT") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("LOGIC, DISCRETE MATHEMATICAL STRUCTURES");
			subjectName.add("COMPUTATIONAL MATHEMATICS");
			subjectName.add("DBMS SYSTEMS");
			subjectName.add("OPERATING SYSTEMS");
			subjectName.add("DBMS SYSTEMS [ PRACTICAL ]");
			subjectName.add("OPERATING SYSTEMS [ PRACTICAL ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. Computer Science") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("JAVA PROGRAMMING");
			subjectName.add("ORACLE");
			subjectName.add("PYTHON");
			subjectName.add("AJAX");
			subjectName.add("PYTHON [ PRACTICAL ]");
			subjectName.add("JAVA PROGRAMMING  [ PRACTICAL ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. Computer Science") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("DISCRETE STRUCTURES");
			subjectName.add("HTML PROGRAMMING");
			subjectName.add("CLOUD COMPUTING");
			subjectName.add("MOBILE APPLICATIONS");
			subjectName.add("HTML PROGRAMMING [ PRACTICAL ]");
			subjectName.add("CLOUD COMPUTING [ PRACTICAL ]");
			
		}
			return subjectName;
	}
}
