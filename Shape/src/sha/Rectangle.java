package sha;

public class Rectangle implements Shape {
	public double getArea(int width, int height, int radius) {
		double recArea = width * height;
		return recArea;
	}
	
	public double getPerimeter(int side1, int side2, int side3, int radius){
		double recPerimeter = (side1 + side2) * 2;
		return recPerimeter;
	}
}
