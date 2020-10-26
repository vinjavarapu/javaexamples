package collectionpractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylistclass {
	
	public static void main(String[] args) {
		
		ArrayList arrlist = new ArrayList();
		LinkedList list1 = new LinkedList();
		arrlist.add("Mango");
		arrlist.add("Apple");
		arrlist.add("Banana");
		System.out.println(arrlist);
		list1 = (LinkedList) arrlist.clone();
		System.out.println(list1);
		arrlist.add("Straberry");
		System.out.println(arrlist);
		arrlist.add("Mango");
		System.out.println("The list of elements in arraylist are " +arrlist);
	//	arrlist.clear();
		//System.out.println("The empty arrylist is " +arrlist);
		arrlist.remove(1);
		System.out.println("the updated arraylist is " +arrlist);
		arrlist.remove("Mango");
		System.out.println("The updated list1 elements are " +arrlist);
		boolean b = arrlist.contains("ddssfsf");
		System.out.println("The boolean value is " +b);
		boolean b1= arrlist.contains("Banana");
		System.out.println("The boolean value of b1 is " + b1);
	}

}
