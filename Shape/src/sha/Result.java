package sha;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

import sha.Shape;
import sha.ShapeFactory;

public class Result {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Scanner scan = new Scanner(System.in);

		//get an object of Circle and call its draw method.
	    Shape shape1 = shapeFactory.getShape("CIRCLE");

	    System.out.println("Please enter its radius");
	    int cirRadius = scan.nextInt();
	    
	    double cirArea = shape1.getArea(0, 0, cirRadius);
	    System.out.println("Circle Area: " + cirArea);
	    
	    System.out.println("Please enter its radius: ");
	    int cirRadius2 = scan.nextInt();
		
	    double cirPerimeter = shape1.getPerimeter(0, 0, 0, cirRadius2);
	    System.out.println("Circle Perimeter: " + cirPerimeter);
	    

		//get an object of Rectangle and call its draw method.
	    Shape shape2 = shapeFactory.getShape("RECTANGLE");

	    System.out.println("Please enter its width");
	    int recWidth = scan.nextInt();
	    System.out.println("Please enter its height");
	    int recHeight = scan.nextInt();
	    
	    double recArea = shape2.getArea(recWidth, recHeight, 0);
	    System.out.println("Rectangle Area: " + recArea);
	    
	    System.out.println("Please enter its width: ");
	    int recSide1 = scan.nextInt();
	    System.out.println("Please enter its height: ");
	    int recSide2 = scan.nextInt();
		
	    double recPerimeter = shape2.getPerimeter(recSide1, recSide2, 0, 0);
	    System.out.println("Rectangle Perimeter: " + recPerimeter);

	    
	    //get an object of Triangle and call its methods.
	    Shape shape3 = shapeFactory.getShape("TRIANGLE");

	    System.out.println("Please enter its width");
	    int triWidth = scan.nextInt();
	    System.out.println("Please enter its height");
	    int triHeight = scan.nextInt();
	    
	    double triArea = shape3.getArea(triWidth, triHeight, 0);
	    System.out.println("Triangle Area: " + triArea);
	    
	    System.out.println("Please enter its side 1: ");
		int triSide1 = scan.nextInt();
	    System.out.println("Please enter its side 2: ");
	    int triSide2 = scan.nextInt();
	    System.out.println("Please enter its side 3: ");
	    int triSide3 = scan.nextInt();
		
	    double triPerimeter = shape3.getPerimeter(triSide1, triSide2, triSide3, 0);
	    System.out.println("Triangle Perimeter: " + triPerimeter);
	}
	
    @Test
    public void testResults(){
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Random rand = new Random();
		int rad1 = rand.nextInt(30) + 1;
    	
	    Shape shape1 = shapeFactory.getShape("CIRCLE");
	    System.out.println("Radius: " + rad1);	    
	    
	    double cirArea = shape1.getArea(0, 0, rad1);
	    System.out.println("Circle Area: " + cirArea);	    		
	    double cirPerimeter = shape1.getPerimeter(0, 0, 0, rad1);
	    System.out.println("Circle Perimeter: " + cirPerimeter + "\n");
	    

		int wid1 = rand.nextInt(30) + 1;
		int hei1 = rand.nextInt(30) + 1;
	    
	    Shape shape2 = shapeFactory.getShape("RECTANGLE");
	    System.out.println("Width: " + wid1 + "   Height: " + hei1);
	    
	    double recArea = shape2.getArea(wid1, hei1, 0);
	    System.out.println("Rectangle Area: " + recArea);		
	    double recPerimeter = shape2.getPerimeter(wid1, hei1, 0, 0);
	    System.out.println("Rectangle Perimeter: " + recPerimeter + "\n");


		int wid2 = rand.nextInt(30) + 1;
		int hei2 = rand.nextInt(30) + 1;
		int sid1 = rand.nextInt(30) + 1;
		int sid2 = rand.nextInt(30) + 1;
		int sid3 = rand.nextInt(30) + 1;
		
	    Shape shape3 = shapeFactory.getShape("TRIANGLE");
	    System.out.println("Width: " + wid2 + "   Height: " + hei2 + "   Side1: " + sid1 + "   Side2: " + sid2 + "   Side3: " + sid3);
	    
	    double triArea = shape3.getArea(wid2, hei2, 0);		
	    System.out.println("Triangle Area: " + triArea);		
	    double triPerimeter = shape3.getPerimeter(sid1, sid2, sid3, 0);
	    System.out.println("Triangle Perimeter: " + triPerimeter);
    }
}
