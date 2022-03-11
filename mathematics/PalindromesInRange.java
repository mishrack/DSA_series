package mathematics;

public class PalindromesInRange {

	public static int isPalindrome(int n)
	{
		int rev = 0 ;
		for(int i = n ;i > 0 ; i = i /10)
		{
			rev = (rev * 10 )+ (i %10 );
		}
		return (n == rev )? 1: 0 ;
	}
	
	public static void printPalindrome(int min , int  max)
	{
		int count = 0 ;
		for(int i = min ; i <= max ; i++)
		{
			if( isPalindrome(i) == 1 )
				{
					System.out.print(i + " ");
					count++ ;
				}
		}
		System.out.println();
		System.out.println("Palindrome count is : " + count );
	}
	
	public static void main(String[] args) {
		int min = 100 ;
		int max = 500 ;
		printPalindrome(min, max);
	}

}
