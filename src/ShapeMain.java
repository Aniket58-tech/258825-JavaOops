import java.lang.Math.*;
import java.util.*;
abstract class Shape {
	int value;
	void calculateArea(int value) {
		
	}
}
class Circle extends Shape {
	void calculateArea(int value) {
		System.out.println(value*value*Math.PI);
	}
}
class Square extends Shape {
	void calculateArea(int value) {
		System.out.println(value*value);
	}
}
public class ShapeMain {
	public static void main(String[] args) {
		System.out.println("Enter the shape Circle or Square:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println("Enter the side:");
		int a= sc.nextInt();
		String str1="Circle";
		if (str.equals(str1)) {
			Circle c=new Circle();
			c.calculateArea(a);
		}
		else {
			Square s=new Square();
			s.calculateArea(a);
		}
	}
}
