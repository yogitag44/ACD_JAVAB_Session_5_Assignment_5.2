import java.util.Scanner;   // Package to take input and output from user

abstract class Figure {    //abstract class Figure and must have abstract methods
	double dim1;       //double type variable
	abstract void findArea();      //abstract method to compute area of three shapes
	abstract void findPerimeter();   //abstract method to compute Perimeter of three shapes
	
	public static void  main (String args[]) {     //Main Method calling all the sub class using object of parent class
		
		System.out.println("=========Computing Area and Perimeter of CIRCLE==========\n");
		Figure FigCicle = new Circle();      //Created object of Parent class and constructor of Child class Circle 
											//which is inheriting properties of parent class Figure
		
		FigCicle.findArea();			//Calling findArea method defined in Circle class
		FigCicle.findPerimeter();			//Calling findPerimeter method defined in Circle class
		
		System.out.println("\n=========Computing Area and Perimeter of RECTANGLE==========\n");
		Figure FigRec = new Rectangle();		//Created object of Parent class and constructor of Child class Rectangle 
												//which is inheriting properties of parent class Figure
		
		FigRec.findArea();				//Calling findArea method defined in Rectangle class
		FigRec.findPerimeter();			//Calling findPerimeter method defined in Rectangle class
		
		System.out.println("\n=========Computing Area and Perimeter of TRIANGLE==========\n");
		Figure FigTri = new Triangle();			//Created object of Parent class and constructor of Child class Tirangle 
												//which is inheriting properties of parent class Figure
		
		FigTri.findArea();			//Calling findArea method defined in triangle class
		FigTri.findPerimeter();			//Calling findPerimeter method defined in triangle class
		
	}
}


class Circle extends Figure{    //Child class Circle extending properties and methods of parent class Figure
	
	public double radius = 20;    //initialized double variable for radius 
	public void findArea() {     //overriding abstract method findArea defined in parent class Figure 
		
		double CircleArea;
		CircleArea = radius * 3.14;     //Calculating area of circle
		System.out.println("Area of cicle is :" + (CircleArea));
	}
	
	public void findPerimeter() {    //overriding abstract method findPerimeter defined in parent class Figure
		double CiclePerimeter;
		CiclePerimeter = 2* radius * 3.14;   //Calculating parameter of circle
		System.out.println("perimeter of cicle is :" + (CiclePerimeter));
	}
	
}

class Rectangle extends Figure{     //Child class REctangle extending properties and methods of parent class Figure
	public double width = 40;
	public double length= 70;
	public void findArea() {			//overriding abstract method findArea defined in parent class Figure 
		double AreaRect = width*length;			//Calculating area of Rectangle
		System.out.println(("Area of Rectangle is: ") + AreaRect);
	}
	
	public void findPerimeter() {			//overriding abstract method findPerimeter defined in parent class Figure
	double PerimeterRect = 2*(length+width);		//Calculating area of Triangle	 
	System.out.println(("Perimeter of Rectangle is: ")+PerimeterRect);
	}
}

class Triangle extends Figure{			//Child class Circle extending properties and methods of parent class Figure
	
	public double height = 10;
	public double base = 30;
	public double side1 = 20;
	public double side2 = 20;
	
	public void findArea() {			//overriding abstract method findArea defined in parent class Figure 
		
		double AreaTri = (height*base)/2;		//Calculating area of Triangle
		System.out.println(("Perimeter of Rectangle is: ")+AreaTri);
	}
	
	public void findPerimeter() {  		//overriding abstract method findPerimeter defined in parent class Figure
		double PerimeterTri = side1+side2+base; //Calculating parameter of Triangle
		System.out.println(("Perimeter of Rectangle is: ")+PerimeterTri);	
	}
}