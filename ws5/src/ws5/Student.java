package ws5;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{

	private int stdId;
	private String firstName;
	private String lastName;
	private ArrayList<String> courses;
	
	public Student()
	{
		stdId = 0;
		firstName = "";
		lastName = "";
		courses = null;
	}
	
	/**
	 * Four argument constructor
	 * @param id An integer that holds the student's id
	 * @param first A string that holds the student's first name
	 * @param last A string that holds the student's last name
	 * @param courses An ArrayList of strings that holds the names of the student's courses
	 * */
	public Student(int id, String first, String last, ArrayList<String> courses)
	{
		this.stdId = id;
		this.firstName = first;
		this.lastName = last;
		this.courses = courses;
	}

	/**
	 * Get the student id
	 * @return int Returns the students id
	 * */
	public int getStdId() {
		return stdId;
	}
	
	/**
	 * Set the student id
	 * @param stdId An integer that holds the students id
	 * */
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	/**
	 * Get the student id
	 * @return String Returns the students first name
	 * */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Set the student's first name
	 * @param firstName A String that holds the students first name
	 * */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the student id
	 * @return String Returns the students last name
	 * */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the student's first name
	 * @param firstName A String that holds the students last name
	 * */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the student id
	 * @return ArrayList<String> Returns the students courses
	 * */
	public ArrayList<String> getCourses() {
		return courses;
	}
	
	/**
	 * Set the student's first name
	 * @param courses An ArrayList of Strings that hold the students courses
	 * */
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	
}
