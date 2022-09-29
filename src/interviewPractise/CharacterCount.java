package interviewPractise;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		/*
			Ebay Interview Questions
Get a String and a character from user 
Count the number of characters between the first occurence and the last occurence of the given character in the String
Do not count the space characters
If the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
For example; "Java is easy" - 'a' ==> 5
          "Java is easy" - 'w' ==> -1
          "Java is easy" - 'e' ==> -1
*/
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String...");
		String s = scan.nextLine();
		
		System.out.println("Enter a character");
		char ch=scan.next().charAt(0);
		
		int firstIndex=s.indexOf(ch);
		int lastIndex=s.lastIndexOf(ch);
		int counter=0;
		
		if(firstIndex==lastIndex)
		{
			System.out.println(-1);
		}
		else
		{
			for(int i=firstIndex+1; i<lastIndex; i++)
			{
				if(s.charAt(i)!=' ')
				{
					counter++;
				}
			}
		}
		
		
		System.out.println(counter);

	}

}
