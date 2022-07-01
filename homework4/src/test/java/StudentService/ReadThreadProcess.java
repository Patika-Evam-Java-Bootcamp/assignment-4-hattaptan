package StudentService;

import java.util.List;



public class ReadThreadProcess implements Runnable {

	// list to keep student info from StudentJsonParse class and than send
	// WriteThreadProcess class
	public static List<Domain.StudentDomain> studentList;

	public void run() {

		try {
			// system waiting time
			Thread.sleep(300);

			// instance of StudentJsonParse
			StudentJsonParse sjp = new StudentJsonParse();
			studentList = sjp.ParseJson();// call ParseJson method, that method include student info from json file.

		} catch (Exception e) {// if there is an error
			System.out.println("Error occurred while reading...");
		}

	}

	public List<Domain.StudentDomain> StudentListtoWrite() {
		// TODO Auto-generated method stub
		return studentList;
	}

}
