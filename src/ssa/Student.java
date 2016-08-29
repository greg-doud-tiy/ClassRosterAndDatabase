package ssa;
import java.util.*;
public class Student implements Comparable<Student> {
	static ArrayList<Student> classRoster = null;
	
	public String id;
	public String firstName;
	public String lastName;
	public String eyeColor;
	public int monthsEmployed;

	public void printClassRoster() {
		// print roster in FirstName sequence
		Collections.sort(classRoster);
		this.printRosterHeader();
		for(Student aStudent : classRoster) {
			this.printStudentDetail(aStudent);
		}
	}
	@Override
	public int compareTo(Student student) {
		return this.firstName.compareTo(student.firstName);
	}
	void printStudentDetail(Student student) {
		System.out.printf("%-6s    %-16s   %-16s   %-9s   %8d\n",
				student.id, student.firstName, student.lastName, student.eyeColor, student.monthsEmployed);
	}
	void printRosterHeader() {
		String header = "Student class roster\n" 
			+ "Empl Id   First name         Last name          Eye color   Months at SSA\n"
			+ "=======   ================   ================   =========   =============";
		System.out.println(header);
	}
	void Init() {
		String[][] students = {
			{"474143", "Jonathan", "Stafford", "Brown", "13" },	
			{"005295", "Kyle", "Deen", "Blue", "2" },	
			{"132617", "Reuben", "Turner", "Blue", "12" },	
			{"306700", "Li", "Lui", "Brown", "12" },
			{"215296", "Joshua", "Franey", "Other", "27" },
			{"523420", "Gabriel", "Hamilton", "Other", "10" },
			{"004014", "Aisha", "Covington", "Brown", "10" },
			{"006789", "Arun", "Soma", "Brown", "2" },
			{"009999", "Steve", "Ellwood", "Other", "2" },
			{"343769", "Shaquil", "Timmons", "Brown", "11" },
			{"001449", "Karen", "Reiter", "Blue", "10" },
			{"267252", "Dax", "Richards", "Brown", "12" },
			{"229949", "Michael", "Sykes", "Brown", "13" },
			{"772223", "Daniel", "Kiros", "Brown", "3" },
			{"001122", "Michael", "C", "Other", "12" },
			{"001212", "Stephen", "Rook", "Brown", "11" },
			{"004444", "Peter", "Choi", "Brown", "2" },
			{"008888", "Evan", "Tizard", "Brown", "12" }
		};
		for(String[] aStudent : students) {
			Student student = new Student();
			student.id = aStudent[0];
			student.firstName = aStudent[1];
			student.lastName = aStudent[2];
			student.eyeColor = aStudent[3];
			student.monthsEmployed = Integer.parseInt(aStudent[4]);
			classRoster.add(student);
		}
		
	}
	public Student() {
		if(classRoster == null) {
			classRoster = new ArrayList<Student>();
			Init();
		}
	}
}
