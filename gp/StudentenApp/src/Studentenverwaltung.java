import java.util.ArrayList;

public class Studentenverwaltung {

	private ArrayList<Student> studenten = new ArrayList<>();
	
	public Studentenverwaltung() {
		
		
	}
	public void addStudent(Student student) {
			if(student != null) {
				this.studenten.add(student);
			}
	}
	public int anzahlStudenten() {
		return this.studenten.size();
	}
	public String getStudenten() {
		String outPut = " ";
		for(Student studi : studenten){
			outPut = outPut + "[" + studi.toString() + "] "; 
		}
		return outPut;
	}
	@Override
	public String toString() {
		return this.studenten.toString();
	}
}
