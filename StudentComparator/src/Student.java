import java.util.Comparator;

class Student implements Comparator<Student> {
	int id;
	String name;
	String collegeName;
	String address;

	public Student(int id, String name, String collegeName, String address) {
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "name : " + name + "\n" + " id : " + id + "\n" + "college Name :" + collegeName + "\naddress : "
				+ address + "\n";
	}

	public String getName() {
		return name;
	}

	public int getid() {
		return id;
	}

	public String getcollege() {
		return collegeName;
	}

	public String getaddress() {
		return address;
	}

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
