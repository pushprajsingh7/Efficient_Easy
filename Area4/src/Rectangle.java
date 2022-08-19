/**
 * constructor and logic to find area of rectangle
 * 
 * @author ss
 *
 */
public class Rectangle {

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		int Res2 = length * width;
		System.out.println(Res2);
	}

	public int length;
	public int width;

	/**
	 * logic for area of rectangle
	 */

	public int getarea2() {
		int Res2 = length * width;

		return Res2;
	}

}
