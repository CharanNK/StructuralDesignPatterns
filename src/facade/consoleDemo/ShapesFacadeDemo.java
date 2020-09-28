package facade.consoleDemo;

interface Shape{
	void draw();
}

class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}

class ShapeMaker{
	private Shape Circle;
	private Shape Rectangle;
	private Shape Square;
	
	public ShapeMaker() {
		Circle = new Circle();
		Rectangle = new Rectangle();
		Square = new Square();
	}
	
	public void drawCircle() {
		Circle.draw();
	}
	
	public void drawSquare() {
		Square.draw();
	}
	
	public void drawRectangle() {
		Rectangle.draw();
	}
}

public class ShapesFacadeDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawSquare();
		shapeMaker.drawRectangle();
	}

}
