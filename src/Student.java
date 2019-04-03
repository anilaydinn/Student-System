
public class Student {					//Student class header

	private String name;				//To hold student's name
	private String surname;				//To hold student's surname
	private String stId;				//To hold student's StudentID
	private double grade1;				//To hold student's grade1
	private double grade2;				//To hold student's grade2
	private double grade3;				//To hold student's grade3
	private double grade4;				//To hold student's grade4
	private double grade5;				//To hold student's grade5
	private double GPA;					//To hold student's GPA
	
	
	
	public Student(){					//Constructor
		
		this.name = name;				//Assign the name field
		this.surname = surname;			//Assign the surname field
		this.stId = stId;				//Assign the stId field
		this.grade1 = grade1;			//Assign the grade1 field
		this.grade2 = grade2;			//Assign the grade2 field
		this.grade3 = grade3;			//Assign the grade3	field
		this.grade4 = grade4;			//Assign the grade4 field
		this.grade5 = grade5;			//Assign the grade5 field
		this.GPA = GPA;					//Assign the GPA field
		
	}
	
	/*
	 	Used setName method to assign name field.
	 	@param String name
	 */
	
	public void setName(String name){
		
		this.name = name;				
	}
	
	/*
	 	Used getName method to show name field to user.
	 	@return this.name
	 */
	
	public String getName(){
		
		return this.name;
	}
	
	/*
	 	Used setSurname method to assign surname field.
	 	@param String surname
	 */
	
	public void setSurname(String surname){
		
		this.surname = surname;
	}
	
	/*
	 	Used getSurname method to show surname field to user.
	 	@return this.surname
	 */
	
	public String getSurname(){
		
		return this.surname;
	}
	
	/*
	 	Used setstId method to assign stId field.
	 	@param String stId
	 */
	
	public void setstId(String stId){
		
		this.stId = stId;
	}
	
	 /*
 	    Used getstId method to show stId field to user.
 	    @return this.stId
	 */
	
	public String getstId(){
		
		return this.stId;
	}
	
	/*
	 	Used setGrade1 method to assign grade1 field.
	 	@param double grade1
	 */
	
	public void setGrade1(double grade1){
		
		this.grade1 = grade1;
	}
	
	/*
	 	Used getGrade1 method to show grade1 field to user.
	 	@return this.grade1
	 */
	
	public double getGrade1(){
		
		return this.grade1;
	}
	
	 /*
 	    Used setGrade2 method to assign grade2 field.
 	    @param double grade2
	 */
	
	public void setGrade2(double grade2){
		
		this.grade2 = grade2;
	}
	
	/*
 		Used getGrade2 method to show grade2 field to user.
 		@return this.grade2
	 */
	
	public double getGrade2(){
		
		return this.grade2;
	}
	
	/*
	    Used setGrade3 method to assign grade3 field.
	    @param double grade3
	 */
	
	public void setGrade3(double grade3){
		
		this.grade3 = grade3;
	}
	
	/*
 		Used getGrade3 method to show grade3 field to user.
 		@return this.grade3
	 */
	
	public double getGrade3(){
		
		return this.grade3;
	}
	
	/*
	    Used setGrade4 method to assign grade4 field.
	    @param double grade4
	 */
	
	public void setGrade4(double grade4){
		
		this.grade4 = grade4;
	}
	
	/*
 		Used getGrade4 method to show grade4 field to user.
 		@return this.grade4
	 */
	
	public double getGrade4(){
		
		return this.grade4;
	}
	
	/*
	    Used setGrade5 method to assign grade5 field.
	    @param double grade5
	 */
	
	public void setGrade5(double grade5){
		
		this.grade5 = grade5;
	}
	
	/*
 		Used getGrade5 method to show grade5 field to user.
 		@return this.grade5
	 */
	
	public double getGrade5(){
		
		return this.grade5;
	}
	
	/*
	 	Used setGPA method to assign GPA field to user.
	 	@param double GPA
	 */
	
	public void setGPA(double GPA){
		
		this.GPA = GPA;
	}
	
	/*
	 	Used getGPA method to show GPA field to user.
	 	@return this.GPA
	 */
	
	public double getGPA(){
		calcGPA(grade1, grade2, grade3, grade4, grade5);
		return this.GPA;
	}
	
	/*
	 	Used calcGPA method to calculate the GPA.
	 	@param double grade1
	 	@param double grade2
	 	@param double grade3
	 	@param double grade4
	 	@param double grade5
	 */
	
	public void calcGPA(double grade1, double grade2, double grade3, double grade4, double grade5){
		
		this.GPA = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
	}
	
}