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
		
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");
		
		//Task 1
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			String s;
			while ((s = br.readLine()) != null) {
			
			//split the string into tokens with "," as the delimiter
			String[] tokens = s.split(",");
			
			
			//Switch case for the 0th index(Shape name)
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
			
		//Task 2
		double minTriangle = 0;
		double maxCircle = 0;
		boolean flag = true;
		
		//Getting a base min for triangle;
		for(int i = 0; i < count && flag; ++i)
		{
			if(shapes[i] instanceof Triangle)
			{
				minTriangle = shapes[i].perimeter();
				flag = false;
			}
			
		}
		
		for(int i = 0; i < count; ++i)
		{
			if(shapes[i] instanceof Triangle && shapes[i].perimeter() < minTriangle)
			{
				minTriangle = shapes[i].perimeter();
				
			}
			else if(shapes[i] instanceof Circle && shapes[i].perimeter() > maxCircle)
			{
				maxCircle = shapes[i].perimeter();
			}
			
		}
		
		//Filter out the shapes into new array
		Shape filteredShapes[] = new Shape[count];
		int filterCount = 0;
		
		for(int i = 0; i < count; ++i)
		{
			//if the shape matches the minPerimeter or maxPerimeter skip over them
			if(shapes[i] instanceof Triangle && shapes[i].perimeter() == minTriangle
			|| shapes[i] instanceof Circle && shapes[i].perimeter() == maxCircle)
			{
				continue;
			}
			else {
				
			filteredShapes[filterCount++] = shapes[i];
			}			
					
		}
	
		System.out.println("------->Task 2 ... <-------");
		
		//Print out the filtered shapes
		for(int i = 0; i < filterCount; ++i) {
			
			System.out.println(filteredShapes[i].toString());
			System.out.println();
		}		
		
		double parallelogramTotal = 0;
		double triangleTotal = 0;
		//Task 3
		for(int i = 0; i < filterCount; ++i)
		{
			if(filteredShapes[i] instanceof Parallelogram)
			{
				parallelogramTotal += filteredShapes[i].perimeter();
			}
			else if(filteredShapes[i] instanceof Triangle)
			{
				triangleTotal += filteredShapes[i].perimeter();
			}
		}
		
		System.out.printf("Total perimeter of parallelogram is: %.5f\n", parallelogramTotal);
		System.out.printf("Total perimeter of triangle is: %f\n", triangleTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}


