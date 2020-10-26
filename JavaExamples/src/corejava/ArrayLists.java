package corejava;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrlist = new ArrayList<String>();
		
		arrlist.add("Ravi");
		arrlist.add("Ramesh");
		arrlist.add("Rajesh");
		System.out.println(arrlist);
		arrlist.add("Ravi");
		System.out.println("Updated elements in arraylist are"  +arrlist);
		
		arrlist.remove(3);
		System.out.println(arrlist);
		
		arrlist.clear();
		System.out.println("The elmenets f arraylist are " +arrlist);
		
	}

}
