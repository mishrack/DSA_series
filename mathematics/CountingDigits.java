package mathematics;

// 1. we can use log10(n) to return the count of digits
// 2. we can use Integer.toString(n) to convert digit into string and use length() then 

import java.util.Scanner ;
public class CountingDigits {
	
	public static int count(int n)
	{
		if(n == 0)
			return 1 ;
		else 
			return 1+ count(n/10)  ;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		int number = sc.nextInt();
		sc.close();
		int result = count(number);
		System.out.print("Digit count is : "+ result);
	}

}	
