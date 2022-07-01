package StudentService;

import java.util.ArrayList;
import java.util.List;
import Domain.StudentDomain;
import Domain.StudentList;

public class WriteThreadProcess implements Runnable {
	// public static boolean isRead = false;
	public List<StudentDomain> list = new ArrayList<StudentDomain>();// student info list to send StudentClass for write
																		// to screen

	public void run() {

		try {

			Thread.sleep(1000);//// system waiting time

			// instance of ReadThreadProcess
			ReadThreadProcess RTP = new ReadThreadProcess();

			// put in a list to show on screen
			list = RTP.StudentListtoWrite();

			// instance og StudentList class
			StudentList studentListClass = new StudentList();
			studentListClass.displayStudent(list);

		} catch (Exception e) {
			// if there is an error
			System.out.println("Error occurred while writing...");
		}

	}

}
