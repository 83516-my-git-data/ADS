package com.sunbeam;

//9. Write a selection sort function to sort array and returns no of comparisons.
public class Question9 {

	public static int selectionSort(int arr[], int N) {
		int comp = 0;
		
		for(int i = 0; i < N-1; i++)
		{
			for(int j = i+1; j < N; j++)
			{
				comp++;
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return comp;
	}
	
	public static void main(String[] args) {

		int arr[] = {55, 44, 11, 22, 33};
		
		int comp = selectionSort(arr, arr.length);
		
		System.out.println("Number of Copmarisons : "+comp);
	}

}
