package corejava;

public class MyClass {
	
	int x=8;
	
	public MyClass() {
		
		x=5;
	}
	
	public static void main(String args[]) {
		
		MyClass myobj = new MyClass();
		System.out.println(myobj.x);
	}

}


