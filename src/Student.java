
public class Student {

	private String name;
	private String surname;
	private String stId;
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	private double grade5;
	private double GPA;
	
	
	
	public Student(){
		
		this.name = name;
		this.surname = surname;
		this.stId = stId;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.GPA = GPA;
		
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setSurname(String surname){
		
		this.surname = surname;
	}
	
	public String getSurname(){
		
		return this.surname;
	}
	
	public void setstId(String stId){
		
		this.stId = stId;
	}
	
	public String getstId(){
		
		return this.stId;
	}
	
	public void setGrade1(double grade1){
		
		this.grade1 = grade1;
	}
	
	public double getGrade1(){
		
		return this.grade1;
	}
	
	public void setGrade2(double grade2){
		
		this.grade2 = grade2;
	}
	
	public double getGrade2(){
		
		return this.grade2;
	}
	
	public void setGrade3(double grade3){
		
		this.grade3 = grade3;
	}
	
	public double getGrade3(){
		
		return this.grade3;
	}
	
	public void setGrade4(double grade4){
		
		this.grade4 = grade4;
	}
	
	public double getGrade4(){
		
		return this.grade4;
	}
	
	public void setGrade5(double grade5){
		
		this.grade5 = grade5;
	}
	
	public double getGrade5(){
		
		return this.grade5;
	}
	
	public void setGPA(double GPA){
		
		this.GPA = GPA;
	}
	
	public double getGPA(){
		calcGPA(grade1, grade2, grade3, grade4, grade5);
		return this.GPA;
	}
	
	public void calcGPA(double grade1, double grade2, double grade3, double grade4, double grade5){
		
		this.GPA = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
	}
	
	public double getCalcAverageGPA(double sum, double numStudent) {
		
		double average;
		sum = 0;
		sum = sum + this.getGPA();
		average = sum / numStudent;
	
		return average;
	}
	
	
}