package fast;

import java.util.Arrays;

public class Fast {
	private Student[] student = new Student[1000];
	private Instructor[] instructor = new Instructor[1000];
	private Course[] courses = new Course[1000];
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public Instructor[] getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor[] instructor) {
		this.instructor = instructor;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Fast [student=" + Arrays.toString(student) + ", instructor=" + Arrays.toString(instructor)
				+ ", courses=" + Arrays.toString(courses) + "]";
	}

}
