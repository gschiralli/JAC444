package ws2;

public class Stack {
	
		
		private char[] arr;
		private int top;
		private int maxSize;
		
		
		//Initialize the stack with the size given
		Stack(int size)
		{	
			arr = new char[size];
			maxSize = size;
			top = -1;
		}
		
		//Adds ch to the stack and increments the size 
		public void push(char ch) {
			
			if(top == maxSize - 1)
			{
				
				System.out.println("Max size reached!");
			}
			
			else 
			{	//Push the character to the next index
				arr[++top] = ch;
			}
			
		}
		
		//Pops the last element out of the stack and decrements the size of the current stack
		public char pop() {
			
			if(top != -1)
			{
				return arr[top--];
			}
			
			return 0;
			
		}
		
	
}
