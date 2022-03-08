package ws4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SerializeStudents {

	public static void main(String[] args) throws IOException {
		
		/* An Array list of type Student to hold all our students and write to the file */
		ArrayList<Student> students = new ArrayList<Student>();
		
		/* Scanner to read from the console */
		Scanner in = new Scanner(System.in);
		
		boolean exit = false;
		
		while(!exit)
		{
			Student student = new Student();
			System.out.println("Enter the students ID: ");
			int id = in.nextInt();
			student.setStdId(id);
			
			System.out.println("Enter the students first name: ");
			String firstName = in.next();
			student.setFirstName(firstName);
			
			System.out.println("Enter the students last name: ");
			String lastName = in.next();
			student.setLastName(lastName);
			
			System.out.println("Enter the students courses seperated by a comma(ex. jac444,web422,etc): ");
			String[] courses = in.next().split(",");
			
			student.setCourses(new ArrayList<> (Arrays.asList(courses)));
			
			students.add(student);
			
			System.out.println("Do you want to add another student?");
			String cont = in.next();
			
			if(cont.toUpperCase() != "Y" || cont.toUpperCase() != "N")
			{
				exit = true;
			}
		
		}

	}

}
