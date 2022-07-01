package Domain;

 
import java.util.List;

public class StudentList {// Student list class to write screen
	
	
	//disolayStudent method, StudentDomain type list as a parameter and writes the students in this list to the screen.
	public void displayStudent(List<Domain.StudentDomain> studentList) {
		
		 for (int i = 0; i < studentList.size(); i++) {
			 
			 String Name = studentList.get(i).getName().toString();//student name
			 String SurName = studentList.get(i).getName().toString();//student surname
			 int Age = studentList.get(i).getAge();//student age
			 System.out.println("-------------------------------------------------");
			 System.out.println(" | Name : "+ Name + " - "+ " Surname : "+ SurName + "Age : "+ Age+"  |");
			 		
		}
		 System.out.println("-------------------------------------------------");
		
	}

	 

}
