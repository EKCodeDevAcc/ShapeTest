package sha;

public class Triangle implements Shape {
	
	public double getArea(int width, int height, int radius) {
		double triArea = width * height * 0.5;
		return triArea;
	}
	
	public double getPerimeter(int side1, int side2, int side3, int radius){
		int triPerimeter = side1 + side2 + side3;
		return triPerimeter;
	}
}
