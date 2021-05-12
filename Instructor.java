package fast;

import java.util.Arrays;

public class Instructor {

	private String name;
	private int id;
	private String address;
	private String phoneNumber;
	private Course[] courses = new Course[0];
	
	public Course[] addCourse(Course course) {
		Course[] x = new Course[courses.length + 1];

		for (int i = 0; i < courses.length; i++) {
			x[i] = courses[i];
		}

		x[x.length - 1] = course;
		courses = x;
		return courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", courses=" + Arrays.toString(courses) + "]";
	}
	
	
}
