package ws5;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class DeSerializeStudentsGUI {

	
	public static void main(String[] args) {
	
		
		JFrame frame = new JFrame("Student Data");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		
		// Creates a button that submits input information
		JButton viewButton = new JButton("View");
		panel.add(viewButton);
		
		
		viewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
					
				JPanel dataPanel = new JPanel();
				dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
				frame.setMinimumSize(new Dimension(300,300));
				
				
				try {
				
					File fileName = new File("Students.out");
					ArrayList<Student> students = new ArrayList<Student>();
					
					FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					students = (ArrayList<Student>) ois.readObject();
					
					ois.close();
					fis.close();
					
					for(Student s : students)
					{
						int i = 1;
						JTextArea data = new JTextArea("ID: " + s.getStdId() + "\nFirst name: " + s.getFirstName()
						+ "\nLast name: " + s.getLastName() + "\nCourses: " +  s.getCourses().toString());
						data.setEditable(false);
						
						
						
						JLabel l = new JLabel("Student " + s.getStdId());
						dataPanel.add(l);
						dataPanel.add(data);
						
					}
					
				
					}catch(Throwable E)
					{
						System.err.println(E);
					}
				
				
				
				frame.remove(panel);
				frame.setSize(300,100);
				frame.add(dataPanel);
				frame.validate();
		
			}
		});
		
	
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	

}
	

