package studio7;

public class Rectangle {
	
	public static double getArea(double length, double height) {
		return length*height;
	}

	public static double getPerimeter(double length, double height) {
		return 2*(length + height);
	}
	
	public static boolean compareArea(double length, double height, double length2, double height2) {
		return length*height < length2*height2;
	}
	
	public static boolean square(double length, double height) {
		return length == height;
	}
	
	public static void main(String[] args) {
		double length = 3;
		double height = 3;
		System.out.println(getArea(length,height));
		System.out.println(getPerimeter(length,height));
		double length2 = 5;
		double height2 = 1;
		System.out.println(compareArea(length,height,length2,height2));
		System.out.println(square(length,height));
	}
	

	
	
}
