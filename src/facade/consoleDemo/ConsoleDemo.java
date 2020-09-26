package facade.consoleDemo;
import java.util.*;

class Buffer{
	private char[] characters;
	private int lineHeight,lineWidth;
	
	public Buffer(int lineHeight, int lineWidth) {
		this.lineHeight = lineHeight;
		this.lineWidth = lineWidth;
	}
	
	public char charAt(int x,int y) {
		return characters[y*lineWidth+x];
	}
}

class ViewPort{
	private final Buffer buffer;
	private final int width;
	private final int height;
	private final int offsetX;
	private final int offsetY;
	
	public ViewPort(Buffer buffer, int width, int height, int offsetX, int offsetY) {
		super();
		this.buffer = buffer;
		this.width = width;
		this.height = height;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}
	
	public char charAt(int x,int y) {
		return buffer.charAt(x+offsetX, y+offsetY);
	}
}

class Console{
	List<ViewPort> viewports = new ArrayList<ViewPort>();
	int width, height;
	
	public Console(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public static Console newConsole (int width,int height) {
		Buffer buffer = new Buffer(width,height);
		ViewPort viewPort = new ViewPort(buffer, width, height, 0, 0);
		Console console = new Console(width, height);
		console.addViewPort(viewPort);
		return console;
	}
	
	public void addViewPort(ViewPort viewPort) {
		this.viewports.add(viewPort);
	}
	
	public void render() {
		for( int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				for(ViewPort viewport:viewports)
					System.out.println(viewport.charAt(x, y));
			}
		}
	}
}

public class ConsoleDemo {
	
	public static void main(String[] args) {
		Console console = new Console(30, 20);
		console.render();
	}

}
