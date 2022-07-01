package StudentService;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import Domain.StudentDomain;

public class StudentJsonParse {
	public List<StudentDomain> ParseJson() throws IOException, org.json.simple.parser.ParseException {

		List<StudentDomain> studentList = new ArrayList<StudentDomain>();
		try {

			// Read file
			FileReader fr = new FileReader("student.json");
			// to parse JSON data.
			JSONParser parser1 = new JSONParser();
			// put in a JsonArray to make an object
			JSONArray jObj = (JSONArray) parser1.parse(fr);

			for (Object object : jObj) {

				// creating a json object to send list student info
				org.json.JSONObject obj = new org.json.JSONObject(object.toString());

				// put in a list all student info
				studentList.add(new StudentDomain(obj.get("name").toString(), obj.get("surname").toString(),
						Integer.parseInt(obj.get("age").toString())));
			}

		} catch (Exception ex) {
			System.out.println("Error occurred while reading Json files");
			ex.printStackTrace();
		}

		// return student list to needed class (ReadThreadProcess class)
		return studentList;

	}

}
