package ws5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SerializeStudentsGUI{

	
	public static void main(String[] args) throws IOException {
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		JFrame frame = new JFrame("Serializing object into file");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		frame.add(inputPanel);
		
		
		JLabel idLabel = new JLabel("Student ID: ");
		JTextField iDText = new JTextField(10);
		inputPanel.add(idLabel);
		inputPanel.add(iDText);
		
		
		JLabel firstNameLabel = new JLabel("First Name: ");
		JTextField firstNameText = new JTextField(10);
		inputPanel.add(firstNameLabel);
		inputPanel.add(firstNameText);
		
		
		JLabel lastNameLabel = new JLabel("Last Name: ");
		JTextField lastNameText = new JTextField(15);
		inputPanel.add(lastNameLabel);
		inputPanel.add(lastNameText);
		
		
		JLabel coursesLabel = new JLabel("Student Courses (separeted by comma): ");
		JTextField coursesText = new JTextField(25);
		inputPanel.add(coursesLabel);
		inputPanel.add(coursesText);
		
		// Creates a button that submits input information
		JButton addButton = new JButton("Add");
		inputPanel.add(addButton);
		
		JButton saveButton = new JButton("Save");
		inputPanel.add(saveButton);
		// Add Action Listener to the submit button
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
					
					
					Student student = new Student();
					
					
					int iD = Integer.parseInt(iDText.getText());
					student.setStdId(iD);
					iDText.setText(null);
					
					String firstName = firstNameText.getText();
					student.setFirstName(firstName);
					firstNameText.setText(null);
					
					// Last Name
					String lastName = lastNameText.getText();
					student.setLastName(lastName);
					lastNameText.setText(null);
					// Courses
					String[] courses = coursesText.getText().split(",");
					coursesText.setText(null);
					
					student.setCourses(new ArrayList<> (Arrays.asList(courses)));
					students.add(student);
					
					System.out.println("Added " + student);
		
		
			}
		});
		
	saveButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				try {
					File fileName = new File("Students.out");
					FileOutputStream fos = new FileOutputStream(fileName);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(students);

					oos.flush();
					fos.close();
				
					System.out.println("Object written to file");
					}catch(Throwable E)
					{
						System.err.println(E);
					}
		
			}
		});
		
		// JFrame setup
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}