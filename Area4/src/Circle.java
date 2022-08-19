/**
 * constructor and logic to find area of circle
 * 
 * @author ss
 *
 */

public class Circle {
	int radius;
	double pi = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * area of circle logic
	 * 
	 * @return
	 */
	public double getarea1() {
		double pi = 3.14;
		double Res1 = pi * radius * radius;
		System.out.println(2 * Res1);
		return Res1;
	}
}
