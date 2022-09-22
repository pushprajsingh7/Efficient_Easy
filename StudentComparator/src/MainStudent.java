import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * .Sort list on the basis of student’s name using: -Comparator interface
 * 
 * @author ss
 *
 */
public class MainStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(
				Arrays.asList(new Student(1, "B", "Medicaps", "Indore"), new Student(2, "C", "College1", "City"),
						new Student(3, "D", "XYZCollege", "XYZcity"), new Student(4, "A", "ABCCollege", "ABCcity")));

		Comparator<Student> compare = Comparator.comparing(Student::getName);
		Collections.sort(students, compare);
		for (Student single : students) {
			System.out.println(single);
		}
	}
}
