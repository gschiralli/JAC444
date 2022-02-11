package Main;

import shapes.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//Create our shape object to store all our shapes.
		Shape shapes[] = new Shape[50];
		int count = 0;
		
		//Task 1
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			String s;
			while ((s = br.readLine()) != null) {
			
			//split the string into tokens with "," as the delimiter
			String[] tokens = s.split(",");
			
			switch(tokens[0])
			{
			case "Circle":
				if(tokens.length == 2) {
					try {
						shapes[count] = new Circle(Double.parseDouble(tokens[1]));
						++count;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				}
				break;
				
			case"Parallelogram":
				if(tokens.length == 3)
				{
					try {
						shapes[count] = new Parallelogram(Double.parseDouble(tokens[1])
								,Double.parseDouble(tokens[2]));
						++count;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			break;
			
			case "Rectangle":
				if(tokens.length == 3)
				{
					try {
						shapes[count] = new Rectangle(Double.parseDouble(tokens[1])
								,Double.parseDouble(tokens[2]));
						++count;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
			case "Square":
				if(tokens.length == 2)
				{
					try {
						shapes[count] = new Square(Double.parseDouble(tokens[1]));
						++count;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
			case "Triangle":
				if(tokens.length == 4)
				{
					try {
						shapes[count] = new Triangle(Double.parseDouble(tokens[1])
								,Double.parseDouble(tokens[2])
								,Double.parseDouble(tokens[3]));
						++count;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;
				
			default:
				break;
			}
			
			}
			
			} catch (IOException e) {
				
			System.out.println(e.getMessage());
			
			}
			
		
		System.out.println();
		System.out.println(count + " shapes were created:");
		for (int i = 0; i < count; i++) { 
			System.out.println(shapes[i]);
			System.out.println();
		}
			
		}
		
	}


