package sha;

public class Circle implements Shape {
	public double getArea(int width, int height, int radius) {
		double cirArea = Math.PI * radius * radius;
		return cirArea;
	}
	
	public double getPerimeter(int side1, int side2, int side3, int radius){
		double cirPerimeter = 2 * Math.PI * radius;
		return cirPerimeter;
	}
}
