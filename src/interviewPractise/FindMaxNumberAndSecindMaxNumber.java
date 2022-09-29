package interviewPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindMaxNumberAndSecindMaxNumber {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
	System.out.println(list.get(list.size()-1));
	System.out.println(list.get(list.size()-2));
	}

}
