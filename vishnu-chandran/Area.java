package classOnes;

import java.util.Scanner;

public class AreasInMethods {

	public static void main(String[] args) {
		double b, h, a; float r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base length of triangle:");
		b = sc.nextDouble();
		System.out.println("Enter the height of triangle: ");
		h = sc.nextDouble();
		
		System.out.println("Enter the side of square:");
		a = sc.nextDouble();
		
		System.out.println("Enter the radius of circle:");
		r=sc.nextFloat();  
		
		DataAreaInMethods obj1 = new DataAreaInMethods();

		System.out.println("area of triangle is:" + obj1.area(b, h));

		System.out.println("The area of square is : " + obj1.area(a));
		
		System.out.println("the area of circle is : "+ obj1.area(r));
	
		sc.close();
	}

}
