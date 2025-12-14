package operation;


	interface Operation {
	    double PI = 3.142;  

	    double area();       
	    double volume();     
	}

	class Cylinder implements Operation {
	    double radius;
	    double height;

	    // Constructor
	    Cylinder(double r, double h) {
	        radius = r;
	        height = h;
	    }

	    //(Surface Area = 2πrh + 2πr²)
	    public double area() {
	        return (2 * PI * radius * height) + (2 * PI * radius * radius);
	    }

	    // (Volume = πr²h)
	    public double volume() {
	        return PI * radius * radius * height;
	    }
	}

	public class CylinderDemo {
	    public static void main(String[] args) {
	       
	        Cylinder c = new Cylinder(5, 10);  //object of cylinder

	        // Display results
	        System.out.println("Area of Cylinder: " + c.area());
	        System.out.println("Volume of Cylinder: " + c.volume());
	    }

}
