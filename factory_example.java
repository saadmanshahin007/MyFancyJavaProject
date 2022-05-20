package creational.pattern;


interface Shape
{
	void draw();
}


class Circle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a circle drawn");
	 }
}


class Square implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a square drawn");
	 }
}

class Rectangle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a rectangle drawn");
	 }
}

class triangle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a triangle drawn");
	 }
}


class ShapeFactory
{
 
	 public Shape getShape(String type) throws Exception
	 {
		 switch (type)
		 {
			 case "Circle":
				 return new Circle();
			 case "Square":
				 return new Square();
			 case "Rectangle":
				 return new Rectangle();
			 default:
				 throw new Exception( "Shape type : "+type+" cannot be instantiated");
		 }
	 }
}

class Painter
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 ShapeFactory shapeFactory = new ShapeFactory();
		 Shape circle=shapeFactory.getShape("Circle");
		 circle.draw();
		 Shape square = shapeFactory.getShape("Square");
		 square.draw();
		 
		 Shape rombus = shapeFactory.getShape("Rombus");
		 rombus.draw();
	 }
}
public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of square
      shape3.draw();
   }
}