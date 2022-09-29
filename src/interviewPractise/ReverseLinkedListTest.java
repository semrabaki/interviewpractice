package interviewPractise;



import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class ReverseLinkedListTest {

	@Test
	public void test() {
		
		
		ReverseLinkedList reverseLinkedList= new ReverseLinkedList();
		
		List<Integer>list= new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
	List result=reverseLinkedList.reverseList(list);
	
	List exceptedList= new LinkedList();
	exceptedList.add(5);
	exceptedList.add(4);
	exceptedList.add(3);
	exceptedList.add(2);
	exceptedList.add(1);
	
	assertEquals(exceptedList, result);
		
		
	}

}
