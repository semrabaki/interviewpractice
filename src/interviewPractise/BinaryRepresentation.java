package interviewPractise;

public class BinaryRepresentation {
	
//	23. return the number of '1's in the binary representation of n for 
//	any integer n, where n > 0
//	Example: for n=6 the binary representation is '110' and the 
//	number of '1's in that
//	 representation is 2

	public static void main(String[] args) {
		
     getCountOfOnes(25);
	}
	public static int getCountOfOnes(int n) {
		String s="";
		
		while(n>0) {
			
			if(n%2==0)
			{
				s=s+"0";
			}
			else {
				s=s+"1";
			}
			
			n=n/2;
			
		}
		System.out.println("s esittir  "+s);
		
		int count=0;
		char c;
		for(int i=0; i<s.length(); i++)
		{ 
			c=s.charAt(i);
			if(c=='1')
			{
				count++;
			}
				
		}
		System.out.println(count);
		return count;
		
	}
}
