package ex1;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;		
	}
	
		public String getName() {
			return this.name;
		}
		
		public int getGrade() {
			return grade;
		}

		public int getClassroom() {
			return classroom;
		}

		public void setClassroom(int classroom) {
			if(classroom < 1) {
				this.classroom = classroom;
				return;
			}
			this.classroom = classroom;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void information() {
			
		}
	
	
	
}
