package mathematics;

public class PalindromeCheck {
	
	// Digits check for Palindrome
	
	public static int isPalindDig(int num , int dup)
	{
		if(num == 0)
			return dup ;
		else
			dup = isPalindDig(num/10, dup);
		
		if(num%10 == dup%10 )
			return dup/10 ;
		else
			return -1 ;
	}
	
	// Check String is Palindrome 
	
	public static boolean isPalindStr(String str)
	{
		int len = str.length() ;
		for(int i = 0 ; i < len/2 ; i++)
		{
			if(str.charAt(i) != str.charAt(len-i-1))
				return false ;
		}
		
		return true ;
	}
	
	
	public static void main(String[] args)
	{
		int num = 2002 ;
		int dup = 2000 ;
		int result = isPalindDig(num , dup);
		System.out.println(result);
		
		String str = "madan" ;
		System.out.println(isPalindStr(str));
	}

}
