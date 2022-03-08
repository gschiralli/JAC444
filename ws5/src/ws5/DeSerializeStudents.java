package ws5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializeStudents {

	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		try {
		
		File fileName = new File("Students.out");
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		students = (ArrayList<Student>) ois.readObject();
		
		ois.close();
		fis.close();
		
		for(Student s: students)
		{
			System.out.println("Student ID: " + s.getStdId());
			System.out.println("First name: " + s.getFirstName());
			System.out.println("Last name: " + s.getLastName());
			System.out.println("Courses: ");
			for(String c : s.getCourses())
			{
				
				System.out.println("- " + c);
			}
			System.out.println();
		}
		}catch(Throwable e)
		{
			System.err.println(e);
		}
	}

}
