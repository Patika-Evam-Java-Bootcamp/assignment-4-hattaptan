package Domain;

public class StudentDomain {
	
	// needed variable for student
	private String name;
	private String surName;
	private int age;
	
	//constructor
	public StudentDomain(String name, String surName, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

 
	//set and get methods
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}
