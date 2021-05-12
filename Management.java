package fast;

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCode("Mth 101");
		course.setName("Mathematics");
		
		Course course2 = new Course();
		course2.setCode("CHM 101");
		course2.setName("Chemistry");
		
		System.out.println(course);
		System.out.println(course2);
		
		Student student = new Student();
		student.setName("Oreoluwa");
		student.setId(001);
		student.enrollCourse(course);
		student.enrollCourse(course2);
		
		System.out.println(student);
		
		student.withdrawCourse(course2.getCode());
		System.out.println(student);
		
		Instructor instructor = new Instructor();
		instructor.setName("Zhain");
		instructor.setId(01);
		instructor.addCourse(course);
		instructor.addCourse(course2);
		System.out.println(instructor);
		
	}

}
