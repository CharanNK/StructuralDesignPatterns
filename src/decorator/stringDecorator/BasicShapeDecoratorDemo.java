package decorator.stringDecorator;

interface Shape {
	   void draw();
}

class Rectangle implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("Shape: Rectangle");
	   }
}

class Circle implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("Shape: Circle");
	   }
}

//Create abstract decorator class implementing the Shape interface
abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
}

//Create concrete decorator class extending the ShapeDecorator class.
class RedShapeDecorator extends ShapeDecorator {
	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}

public class BasicShapeDecoratorDemo {
	public static void main(String[] args) {
	      Shape circle = new Circle();
	      Shape redCircle = new RedShapeDecorator(new Circle());
	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      
	      circle.draw(); //Circle with normal border
	      redCircle.draw(); //Circle of red border
	      redRectangle.draw(); //Rectangle of red border
	   }
}
