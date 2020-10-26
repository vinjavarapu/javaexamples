package collectionpractice;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistclass {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		System.out.println(list);
		
		list.add("Strawberry");
		System.out.println("The updated linkedlist is " +list);
		
		list.remove("Mango");
		System.out.println("The updated list1 are " + list);
		
		boolean b = list.contains("Apple");
		System.out.println("The boolean value is " + b);
		// TODO Auto-generated method stub
		
		list.clear();
		System.out.println("The empty linked list is " + list);

	}

}
