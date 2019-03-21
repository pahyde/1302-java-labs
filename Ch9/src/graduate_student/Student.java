package graduate_student;


public class Student {
	//Fields
	private static int numStudents = 0;
	private String name;
	private double gpa;
	
	//Accessor Methods (Getters & Setters) 
	public static int getNumStudents() {return numStudents;}
	public double getScore() {return gpa;}
	public String getName() {return name;}
    public void setGpa(double gp) {gpa = gp;}
    
    //Constructors
    public Student(String n, double gp) {
		name = n;
		gpa = gp;
		numStudents++;
	}
    
    public Student(Student s) {
		name = s.name;
		gpa = s.gpa;
		numStudents++;
	}
    
    
    //Overriding methods inherited from Object class
    public boolean equals(Object o) {
    	if (o instanceof Student) {
    		Student other = (Student) o;
        	return name.equals(other.getName()) && gpa == other.getScore();
    	}
    	return false;
    }
    
    public String toString() {
    	return String.format("name: %s, gpa: %.2f", name, gpa);
    }
	
}