package Adaptors;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePushEfficient {
	Queue<Integer> main;
	Queue<Integer> helper;
	
	public StackUsingQueuePushEfficient() {
    main = new LinkedList<>();
    helper = new LinkedList<>();
} 
	//T.C isO( 1)
	public void push(int value) { 
		main.add(value);
	}
	
	public int pop() { 
		if(main.isEmpty()) return -1;
		
		//// moving n-1 elements from main to helper
		while(main.size() > 1) {
		helper.add(main.remove());			
		}
		int itemToRemove = main.remove();
		
		//swap main and helper
		Queue<Integer> temp = main;
		main = helper;
		helper = temp;
		
		return itemToRemove;
	}
	
	public int peek( ) { 
if(main.isEmpty()) return -1;
		
		//// moving n-1 elements from main to helper
		while(main.size() > 1) {
		helper.add(main.remove());			
		}
		int itemToReturn = main.peek();
		helper.add(itemToReturn);
		
		//swap main and helper
		Queue<Integer> temp = main;
		main = helper;
		helper = temp;
		
		return itemToReturn;
	}
	
	public boolean isEmpty( ) { 
		return main.isEmpty();
	}
	
	public int size() { 
		return main.size();
	}
	}
