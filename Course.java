package fast;

import java.util.Arrays;

public class Course {

	private String code;
	private String name;
	private int numberOfSections;
	private Student[] student;
	private Instructor[] instructor;

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSections() {
		return numberOfSections;
	}

	public void setNumberOfSections(int numberOfSections) {
		this.numberOfSections = numberOfSections;
	}

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

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + ", numberOfSections=" + numberOfSections + ", student="
				+ Arrays.toString(student) + ", instructor=" + Arrays.toString(instructor) + "]";
	}

}
