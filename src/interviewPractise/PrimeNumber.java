package interviewPractise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		primeCalculator(num);
		

	}
	
	
	public static void primeCalculator(int num) {
		int flag=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println(num+" is not a prime number");
		}else
		{
			System.out.println(num+" is a prime number");
		}
		
	}

}
