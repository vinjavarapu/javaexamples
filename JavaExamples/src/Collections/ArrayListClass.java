package Collections;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		String[] fruits = new String[3];
		fruits[0]="Mango";
		fruits[1]="Banana";
		fruits[2]= "Apple";
		System.out.println(fruits[0]);
		
		ArrayList arrlist = new ArrayList();
		arrlist.add("Mango");
		arrlist.add("Banana");
		arrlist.add("Apple");
		System.out.println(arrlist);
	//	arrlist.clear();
	//	System.out.println(arrlist);
		boolean b =	arrlist.contains("BBBB");
		System.out.println(b);
		arrlist.remove("Mango");
		System.out.println(arrlist);
		System.out.println(arrlist.get(0));
		
	}

}
