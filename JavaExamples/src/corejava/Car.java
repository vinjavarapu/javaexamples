package corejava;

public class Car {
	  int modelYear;
	  String modelName;

	  public Car(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public Car() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  
		  Car myCar1 = new Car();
	    Car myCar = new Car(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	    
	    System.out.println(myCar1.modelYear + " " + myCar1.modelName);
	  }
	}