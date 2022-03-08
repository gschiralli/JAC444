package ws5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
			try {
			System.out.print("Enter the students ID: ");
			int id = in.nextInt();
			student.setStdId(id);
			
			System.out.print("Enter the students first name: ");
			String firstName = in.next();
			student.setFirstName(firstName);
			
			System.out.print("Enter the students last name: ");
			String lastName = in.next();
			student.setLastName(lastName);
			
			System.out.print("Enter the students courses seperated by a comma(ex. jac444,web422,etc): ");
			String[] courses = in.next().split(",");
			
			student.setCourses(new ArrayList<> (Arrays.asList(courses)));
			
			students.add(student);
			
			System.out.print("Do you want to add another student? ");
			String cont = in.next();
			
			if(cont.toUpperCase().equals("N"))
			{
				
				exit = true;
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				exit = true;
			}
			
			
		
		}
		
		try {
		File fileName = new File("Students.out");
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(students);

		oos.flush();
		fos.close();
		in.close();
		
		System.out.println("Object written to file");
		}catch(Throwable e)
		{
			System.err.println(e);
		}
	}

}
