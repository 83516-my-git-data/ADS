package com.sunbeam;

//7. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Output: 3
public class Question7 {

	public static void firstNonRepeating(int arr[], int N) {
		
		for(int i=0; i<N-1; i++) 
		{
			int count=0;
			
			for(int j=i+1; j<N; j++) 
			{
				if(arr[i]==arr[j]) 
				{
					count++;
				}
			}
			
			if(count == 0) 
			{
				System.out.println("First Non-repeating element  : " +arr[i]);
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		firstNonRepeating(arr, arr.length);
	}

}
