package Array;

import java.util.Arrays;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int[] array_nums = {3,5,2,4,8};
		System.out.println("Original Array: "+Arrays.toString(array_nums));
		
		System.out.println("Even numbers are: ");
		for(int i = 0;i<array_nums.length;i++) 
		{
			if(array_nums[i]% 2 == 0)
				System.out.print(array_nums[i]+" ");
		}
		
		
		System.out.println("\nOdd numbers are: ");
		for(int i = 0;i<array_nums.length;i++) 
		{
			if(array_nums[i]% 2 != 0)
				System.out.print(array_nums[i]+" ");
		}
			
	}

}
