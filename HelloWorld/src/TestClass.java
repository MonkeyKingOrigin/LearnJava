
class Shape {
	//class for shape
    public double area ()
    {
        return 0;
    }
}

class Circle extends Shape {
	Circle(double diameter) {
		this.diameter = diameter;
	}
	
	public static final double PI = Math.PI;
	public double diameter;
	
	public double area() {
		double radius = diameter/2.0;
		return radius*radius*PI/2.0;
	}
}
	
class Rectangle extends Shape {
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double length;
	public double width;
	
	public double area() {
		return length*width;
	}
}


public class TestClass {
	public static void main(String[] args) {
		Shape s1 = new Circle (8);
        Shape s2 = new Rectangle (5.0, 4.0);
		
        
        System.out.println (s1.area());
        System.out.println (s2.area());
		Shape larger = getLargerShape(s1,s2);

        System.out.println("The area of the larger shape is: "+larger.area());
	}
    
	public static Shape getLargerShape(Shape s1, Shape s2) {
        if(s1.area() > s2.area())
            return s1;
        else
            return s2;
    }
}