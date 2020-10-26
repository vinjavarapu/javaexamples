package corejava;

import java.util.ArrayList;

public class Test {
	
	public static void main(String args[]) {
		
		int[] data = new int[2];
		data[0]= 1;
		data[1]= 2;
		System.out.println("The array value of First index is " + data[0]);
		
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		data1.add(1);
		data1.add(2);
		data1.add(3);
	      
		System.out.println(data1);
		System.out.println("The arrayList value of Furst element is " +data1.get(0));
		
	}

}
