package mathematics;

// Program to find the largest palindrome number which is product of n digit number
public class PalindromeLargetsOfNDigit {

	
	public static int largestPalindrome(int n)
	{
		// find the upper limit and lower limit
		int upper_lim = (int)Math.pow(10,n) - 1 ;
		int low_lim = (1 + upper_lim) /10 ;
		
		int max_product = 0 ;
		
		// now iterating from upper limit to lower limit find the each product of n digit number and check if it palindrome or not
		for(int i = upper_lim ; i >= low_lim ; i--)
		{
			for(int j = i ; j >= low_lim ; j--)
			{
				int product =  i * j ;
				
				if(product < max_product)
					break ;
				
				int number = product ;  
				int reverse = 0 ;
				
				// now finding reverse using product stored in number 
				while(number != 0 )
				{
					reverse = reverse * 10 + number % 10 ;
					number /= 10 ;
				}
				
				// check if product is greater then max_product and reverse is palindrome of product of n digit number(product)
				if(reverse == product && product > max_product)
				{
					max_product = product  ;
				}
			}
		}
		
		return max_product  ;
	}
	
	public static void main(String[] args) {
		int num = 2 ;
		System.out.println(largestPalindrome(num));
	}

}
