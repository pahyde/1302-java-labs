package graduate_student;

public class GraduateStudent extends Student {
	private String advisor;
	
	//Constructor
	public GraduateStudent(String name, double gp, String a) {
		//super() calls Student Constructor
		super(name, gp);
		advisor = a;
	}
	
	//Getter Method
	public String getAdvisor() {
		return advisor;
	}
	
	//Override toString method from Student super class
	public boolean equals(Object o) {
		if (o instanceof GraduateStudent) {
			return super.equals(o) && advisor == ((GraduateStudent) o).getAdvisor();
		}
		return false;
    }
	
	public String toString() {
		return super.toString() + " Advisor: " + advisor;
	}
}