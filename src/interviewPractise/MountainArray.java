package interviewPractise;

public class MountainArray {
	
	
	/*
	 * 15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
	 * the maximum value, decreasing constantly after the maximum value
	 * 
	 * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
	 * the maximum value, decreasing and increasing after the maximum value
	 * 
	 * Create a method to check if it is Mountain Array or not. Use as possible as
	 * Functional Programming
	 * 
	 */

	public static void main(String[] args) {
		
		
		int[]arr1 = {0,2,5,15,35,45,13,11};
		int size=arr1.length/2;
		
		int flag1=0;
		int flag2=0;
		
	for(int i=1; i<4; i++)
		{
			if(arr1[i-1]>arr1[i])
			{
			   flag1=1;
			}
				
		}
	
	for(int j=4; j<=6; j++) {
		if(arr1[j]<arr1[j+1])
		{
			flag2=1;
		}
	}
		
		if(flag1==0&&flag2==0)
		{
			System.out.println("mountain array");
		}
		else
		{
			System.out.println("not a mountain array");
		}
		

	}

}
