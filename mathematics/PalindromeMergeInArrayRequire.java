package mathematics;

// Minimium number of merge operation required to make array as a palindrome

public class PalindromeMergeInArrayRequire {

	public static int findMinMaerge(int[] arr)
	{
		int  merge_count = 0 ;
		int n = arr.length ;
	
		for(int i = 0 , j = n-1 ; i<= j;)
		{
			// case 1: if both arr[i] and arr[j] are equal then no merge is required
			if(arr[i] == arr[j])
			{
				i++ ;
				j-- ;
			}
			else if(arr[i] > arr[j])   // case 2: if arr[i] > arr[j]
			{
				j-- ;
				arr[j] = arr[j] + arr[j+1] ;
				merge_count++ ;
			}
			else   // case 3: if arr[i]  < arr[j]
			{
				i++ ;
				arr[i] = arr[i] + arr[i-1] ;
				merge_count++ ;
			}
			
		}
		return merge_count  ;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,5,1} ;
		System.out.println(findMinMaerge(arr));

	}

}
