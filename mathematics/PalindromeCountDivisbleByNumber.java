package mathematics;

//Program to find count of palindromes by using N digit number also divisible by 9 

/*
Logic is fist half and seconf half of palindrome can be arranges 1 to (N-1)/2 in odd and 1 to (N-2)/2 in even
Count of palindromes can be 9^(N-1)/2 in case N is odd and 9^(n-2)/2 in case N is even
*/
public class PalindromeCountDivisbleByNumber {

	public static int countPalindrome(int n)
	{
		int count = 0 ;
		if(n%2 == 1)
		{
			count = (int)Math.pow(9, (n-1)/2) ;    // case of odd N
		}
		else
			count = (int)Math.pow(9, (n-2)/2) ;   // case of even N
	
		return count ;
	}
	
	public static void main(String[] args) {
		int num = 3 ;
		System.out.println(countPalindrome(num));
	}

}
