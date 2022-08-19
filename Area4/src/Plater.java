import java.util.*;

/**
 * program to find surface area of plater that is a rectangle-2*circles and
 * connecting circle and rectangle class without inheritance
 * 
 * @author ss
 *
 */
public class Plater {
	Circle circle;
	Rectangle rectangle;

	//list.add(autobox);
	/**
	 * constructor taking length width of rectangle and radius of circle to
	 * calculate surface area
	 * 
	 * @param length
	 * @param width
	 * @param radius
	 */
	public Plater(int length, int width, int radius) {
		circle = new Circle(radius);
		rectangle = new Rectangle(length, width);
	}

	void getarea() {

		System.out.println(rectangle.getarea2() - 2 * circle.getarea1());
	}

	public static void main(String[] args) {
		Plater p = new Plater(512, 2, 30);
		p.getarea();
		
		
	}
}