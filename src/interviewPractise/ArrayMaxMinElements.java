package interviewPractise;

import java.util.Scanner;

public class ArrayMaxMinElements {
	
	 /*
 	Create a function that takes an array and 
 	returns the difference between the biggest and the smallest numbers.
    Ask user to enter array elements.
*/

	public static void main(String[] args) {
		
		
       Scanner scan= new Scanner(System.in);
       
       int arr[]=new int[5];
		
       for(int i=0;i<arr.length; i++) {
		System.out.println("Enter a number");
		
		arr[i]=scan.nextInt();
       }
       
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i=0; i<arr.length; i++)
       {
    	   
    	   if(max<arr[i])
    	   {
    		   max=arr[i];
    	   }
    	   if(min>arr[i])
    	   {
    		   min=arr[i];
    	   }
    	   
       }
		System.out.println(max-min);

	}

}
