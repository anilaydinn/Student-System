import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Student st = new Student();
		int select;
		int i = 0;
		
		
		Scanner keyboard = new Scanner(System.in);	
			
		System.out.println();
		
		while(i != -1){
			
			showMenu();
			System.out.println();
			select = keyboard.nextInt();
			
			switch(select){
			
			case 1:
					insertStudent();
			break;	
			
			case 2:
					showStudentInfo();
			break;
			
			case 3:
				 	showAllStudent();
			break;
			
			case 4:
					updateStudentInfo();
			break;
			
			case 5:
					deleteStudent();
			break;
			
			case 6:		
					showStudentGPA();
			break;
			
			case 7:
					caclAverageGPA();
			break;
			
			case -1:
				i = -1;
			break;
			}
		
		}
		
	}
	
	public static void showMenu(){
		
		System.out.println("Welcome Student System");
		System.out.println("-----------------------");
		System.out.println("1-�nsert Student.");
		System.out.println("2-Show Student Information.");
		System.out.println("3-Show All Student Information.");
		System.out.println("4-Update Student Information.");
		System.out.println("5-Delete Student Information.");
		System.out.println("6-Show GPA.");
		System.out.println("7-Show the Average GPA.");
		System.out.println("-1 To Exit.");
	
	}
	
	
	
	public static void insertStudent() throws FileNotFoundException {
		
		String input;
		int numStudent;
		double doubleInput;
		Scanner keyboard = new Scanner(System.in);
		PrintWriter printWriterStd = new PrintWriter("std.txt");
		PrintWriter printWriterStd1 = new PrintWriter("std1.txt");
		PrintWriter printWriterStd2 = new PrintWriter("std2.txt");
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		
	
		System.out.println("How many student will be enter?");
		numStudent = keyboard.nextInt();
		
		Student [] students = new Student[numStudent];
		
		System.out.println();
	
	for(int x = 0; x < students.length; x++){
		
		students[x] = new Student();
		
		System.out.print("Name: ");
		input = keyboard.next();
		students[x].setName(input);

		System.out.print("Surname: ");
		input = keyboard.next();
		students[x].setSurname(input);

		System.out.print("StudentID: ");
		input = keyboard.next();
		students[x].setstId(input);

		System.out.print("Grade-1: ");
		doubleInput = keyboard.nextDouble();
		students[x].setGrade1(doubleInput);

		System.out.print("Grade-2: ");
		doubleInput = keyboard.nextDouble();
		students[x].setGrade2(doubleInput);

		System.out.print("Grade-3: ");
		doubleInput = keyboard.nextDouble();
		students[x].setGrade3(doubleInput);

		System.out.print("Grade-4: ");
		doubleInput = keyboard.nextDouble();
		students[x].setGrade4(doubleInput);

		System.out.print("Grade-5: ");
		doubleInput = keyboard.nextDouble();
		students[x].setGrade5(doubleInput);

		printWriterStd1.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());
		printWriterStd.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());
		printWriterStd2.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());

		System.out.println();
		
	}
		printWriterStd.close();
		printWriterStd1.close();
		printWriterStd2.close();
		
		
	}
	
	public static void showStudentInfo() throws FileNotFoundException {
		String stID;
		Scanner keyboard = new Scanner(System.in);
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		Scanner scanFileStd = new Scanner(fileStd);
		String line;
		
		System.out.println("Please enter StudentID for show student.");
		stID = keyboard.next();
		
		while(scanFileStd.hasNext()){
			
			line = scanFileStd.nextLine();
			
			if(line.contains(stID)){
				
				System.out.println(line);
			}
		}
		scanFileStd.close();
		
	}
	
	public static void showAllStudent() throws FileNotFoundException {
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		Scanner scanFileStd = new Scanner(fileStd);
		String line;
		
		while(scanFileStd.hasNext()){
			
			line = scanFileStd.nextLine();
			System.out.println(line);
		}
		scanFileStd.close();
		System.out.println();
	}
	
	public static void updateStudentInfo() throws FileNotFoundException {
		
		String line;
		String input;
		
		File fileStd1 = new File("//home//thracian//Desktop//StudentSystem//std1.txt");
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		Scanner scanStd1 = new Scanner(fileStd1);
		Scanner keyboard = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Please enter StID for update:");
		input = keyboard.next();
		
		while(scanStd1.hasNext()) {
			
			line = scanStd1.nextLine();
			
			
			if(line.contains(input)) {
				
				System.out.println("**Update this** : " + line);
				System.out.println();
				
				System.out.println("Name:");
				input = keyboard.next();
				st.setName(input);
				
				System.out.println("Surname:");
				input = keyboard.next();
				st.setSurname(input);
				
				System.out.println("StID:");
				input = keyboard.next();
				st.setstId(input);
				
				System.out.println("Grade-1:");
				input = keyboard.next();
				st.setGrade1(Double.parseDouble(input));
				
				System.out.println("Grade-2:");
				input = keyboard.next();
				st.setGrade2(Double.parseDouble(input));
				
				System.out.println("Grade-3:");
				input = keyboard.next();
				st.setGrade3(Double.parseDouble(input));
				
				System.out.println("Grade-4:");
				input = keyboard.next();
				st.setGrade4(Double.parseDouble(input));
				
				System.out.println("Grade-5:");
				input = keyboard.next();
				st.setGrade5(Double.parseDouble(input));
				break;
			}
			
			System.out.println("Name: " + st.getName() + " Surname: " + st.getSurname() + " StID: " + st.getstId() + " Grade-1: " + st.getGrade1() + " Grade-2: " + st.getGrade2() + " Grade-3: " + st.getGrade3() + " Grade-4: " + st.getGrade4() + " Grade-5: " + st.getGrade5());
		//break;
		}
		scanStd1.close();	
		
	}
	
	public static void deleteStudent() throws FileNotFoundException {
		
		String line;
		String willDelete;
		
		PrintWriter temp = new PrintWriter("temp.txt");
		File tempRead = new File("//home//thracian//Desktop//StudentSystem//temp.txt");
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		Scanner keyboard = new Scanner(System.in);
		Scanner scanFileStd = new Scanner(fileStd);
		Scanner scanTemp = new Scanner(tempRead);
		
		
		System.out.print("Please select delete student by a number: ");
		willDelete = keyboard.next();
		

		while(scanFileStd.hasNext()){
			
			
			line = scanFileStd.nextLine();
			
			if(line.contains(willDelete)){
				
				continue;
			}
			
			temp.println(line);
			
		}
		temp.close();
		System.out.println();		
				
		while(scanTemp.hasNext()) {
			
			line = scanTemp.nextLine();
			System.out.println(line);
		}
	}
	
	public static void showStudentGPA() throws IOException {
		
		File file = new File("//home//thracian//Desktop//StudentSystem//std.txt");
		Scanner scanFile = new Scanner(file);
		Scanner keyboard = new Scanner(System.in);
		String ss = null;
		String stdID;
		
		System.out.println("Please enter stdID: ");
		stdID = keyboard.next();
		
		
		while(scanFile.hasNext()) {
			
			ss = scanFile.nextLine();
			
			if(ss.contains(stdID)) {
				
				String[] parts = ss.split("GPA: ");
				System.out.println(parts[1].trim());
			}
			
		}
				
	}
	
	public static void caclAverageGPA() throws FileNotFoundException {
		
		File filestd1 = new File("//home//thracian//Desktop//StudentSystem//std1.txt");
		Scanner scanFile = new Scanner(filestd1);
		String ss = null;
		double gpa;
		double sum = 0;
		int count = 0;
		double average = 0;
		
		
		while(scanFile.hasNext()) {
			
			ss = scanFile.nextLine();		
			count++;
			String[] parts = ss.split("GPA: ");
			
			gpa = Double.parseDouble(parts[1].trim());
			sum = sum + gpa;
			average = sum / count;
			
			
		}
		System.out.println("Average of GPA is : " + average);
		System.out.println();
				
		
	}
	
}
