package ws2;

public class Palindrome {

	public static void main(String[] args) {
		
		//Looping through all the arguments and checking if they are palindromes
		for(String s: args)
		{
			if(isPalindrome(s.toLowerCase()))
			{
				System.out.println(s + " is a palindrome");
			}
			else {
				System.out.println(s + " is not a palindrome");
			}
		}
		
	}
	
	//Check if the given input is a palindrome
	public static boolean isPalindrome(String input)
	{
		
		Stack stack = new Stack(input.length());
		
		//push the input character by character into the stack
		for(int i =0; i < input.length(); ++i)
		{
			stack.push(input.charAt(i));
		}
		
		//compare chars starting from the end of the stack and beginning of the input
		for(int i = 0; i < input.length(); ++i)
		{
			if(stack.pop() != input.charAt(i))
			{
				
				return false;
			}
		}
		
		
		return true;
		
	}

}
