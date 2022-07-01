package Test;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import StudentService.ReadThreadProcess;
import StudentService.WriteThreadProcess;

public class Test {
	public static void main(String[] args) throws IOException, ParseException {

		ReadThreadProcess RTP = new ReadThreadProcess();// instance of ReadThreadProcess
		Thread thread = new Thread(RTP);// create thread
		thread.start(); // start thread
		WriteThreadProcess WTP = new WriteThreadProcess();// instance of WriteThreadProcess
		Thread thread1 = new Thread(WTP);// create thread
		thread1.start(); // start thread

	}

}
