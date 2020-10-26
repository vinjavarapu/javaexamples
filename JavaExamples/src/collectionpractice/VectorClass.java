package collectionpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String args[]) {
		
		Vector vec = new Vector();
		vec.add("Mango");
		vec.add("Apple");
		vec.add("Banana");
		
		System.out.println("The vector data s " + vec);
		
		vec.add("Mango");
		System.out.println("The updated vectors data is " + vec);
		
		int n = vec.capacity();
		System.out.println("The capacity of the vector is " +n);
		
		Vector vec1 = new Vector();
	
		vec1=	 (Vector) vec.clone();
	System.out.println("The cloned vector is " +vec1);
	
	    vec.clear();
	    System.out.println("The empty array of vector is " +vec);
	    
	    vec1.remove(0);
	    System.out.println("The updated vec1 data is " +vec1);
	    
	     boolean verifydata =  vec1.contains("Ravi");
	     System.out.println("the verification data in vector is " + verifydata);
	
	   
	}

}
