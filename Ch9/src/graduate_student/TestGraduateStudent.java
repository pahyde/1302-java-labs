package graduate_student;

public class TestGraduateStudent {
	public static void main(String[] args) {
		System.out.println("Student:\n");
		
		//Create Student objects
		Student a = new Student("John", 3.0);
		Student b = new Student("Jane", 3.2);
		Student c = new Student("John", 3.0);
		
		//Print Student objects. toString method called by Student objects
		System.out.println("Student a, " + a);
		System.out.println("Student b, " + b);
		System.out.println("Student c, " + c + "\n");
		
		//Check equality between Students
		System.out.println("Student a == Student b ? " + a.equals(b));
		System.out.println("Student a == Student c ? " + a.equals(c));
		
		
		
		System.out.println("\nGraduate Student:\n");
		
		//Create GraduateStudent objects
		GraduateStudent gradA = new GraduateStudent("John", 3.0, "Advisor 1");
		GraduateStudent gradB = new GraduateStudent("Jane", 3.2, "Advisor 2");
		GraduateStudent gradC = new GraduateStudent("John", 3.0, "Advisor 2");
		GraduateStudent gradD = new GraduateStudent("John", 3.0, "Advisor 1");
		
		//Print GraduateStudent objects.
		System.out.println("Grad A, " + gradA);
		System.out.println("Grad B, " + gradB);
		System.out.println("Grad C, " + gradC);
		System.out.println("Grad D, " + gradD + "\n");
		
		//Check equality between GraduateStudents
		System.out.println("Grad A == Grad B ? " + gradA.equals(gradB));
		System.out.println("Grad A == Grad C ? " + gradA.equals(gradC));
		System.out.println("Grad A == Grad D ? " + gradA.equals(gradD));
		
		/*
		
		Code output:
		
		Student:

		Student a, name: John, gpa: 3.00
		Student b, name: Jane, gpa: 3.20
		Student c, name: John, gpa: 3.00

		Student a == Student b ? false
		Student a == Student c ? true

		Graduate Student:

		Grad A, name: John, gpa: 3.00 Advisor: Advisor 1
		Grad B, name: Jane, gpa: 3.20 Advisor: Advisor 2
		Grad C, name: John, gpa: 3.00 Advisor: Advisor 2
		Grad D, name: John, gpa: 3.00 Advisor: Advisor 1

		Grad A == Grad B ? false
		Grad A == Grad C ? false
		Grad A == Grad D ? true
		
		*/
		
	}
}
