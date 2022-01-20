
public class Solution {

	public static void main(String[] args) {
		
		final int ROWS = 8;
		
		for(int i = 1; i <= ROWS; ++i)
		{
			int rowCount = (i * 2) - 1;
			
			for(int j = 1; j <= ROWS - i; ++j)
				System.out.print("    ");
			
			for(int val = 1, k = 1; k <= rowCount; ++k)
			{	
				System.out.format("%4d", val);
				
			if(k < i)		
				val *= 2;
			
			else 
				val /= 2;
			}
			
			System.out.println();
		}
		
		
	}

}
