package fast;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private Course[] courses = new Course[0];
	private String[] grades;

	public Course[] enrollCourse(Course course) {
		Course[] x = new Course[courses.length + 1];

		for (int i = 0; i < courses.length; i++) {
			x[i] = courses[i];
		}

		x[x.length - 1] = course;
		courses = x;
		return courses;
	}

	public Course[] withdrawCourse(String courseCode) {
		Course[] x = new Course[courses.length - 1];
		for (int i = 0, k = 0; i < courses.length; i++) {
			if (courses[i].getCode().equals(courseCode)) {
				continue;
			}
			x[k++] = courses[i];
		}
		courses = x;
		return courses;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String[] getGrades() {
		return grades;
	}

	public void setGrades(String[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", courses=" + Arrays.toString(courses) + ", grades=" + Arrays.toString(grades) + "]";
	}
}
