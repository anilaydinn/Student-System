import java.util.Scanner;			//For the Scanner class.
import java.io.*;					//For the I/O class.


public class Main {					//Main class header.
	
	public static void main(String[] args) throws IOException{			//Main method header.
		
		Student st = new Student();				//Create new Student object for take values.
		int select;								//Select for menu operations.
		int i = 0;								//For user controlled loop.
		
		
		Scanner keyboard = new Scanner(System.in);		//Create Scanner object for keyboard input.
			
		System.out.println(); 							//Empty line.
		
		while(i != -1){									//User controlled loop here when i equal -1 program stop.
			
			showMenu();									//Call the show menu function.
			System.out.println();						//Empty line.
			select = keyboard.nextInt();				//Take the select value from user.
			
			switch(select){								//Switch case statement start here.
			
			case 1:
					insertStudent();					//If user selects 1 insertStudent method start.
			break;	
			
			case 2:
					showStudentInfo();					//If user selects 2 showStudentInfo method start.
			break;
			
			case 3:
				 	showAllStudent();					//If user selects 3 showAllStudent method start. 
			break;
			
			case 4:
					updateStudentInfo();				//If user selects 4 updateStudentInfo method start.
			break;
			
			case 5:
					deleteStudent();					//If user selects 5 deleteStudent method start.
			break;
			
			case 6:		
					showStudentGPA();					//If user selects 6 showStudentGPA method start.
			break;
			
			case 7:
					calcAverageGPA();					//If user selects 7 calcAverageGPA method start.
			break;
			
			case -1:
				i = -1;									//If user selects -1 program stop.
			break;
			}
		
		}
		
	}
	
	public static void showMenu(){									//showMenu method header.
		
		System.out.println("Welcome Student System");				//
		System.out.println("-----------------------");				//
		System.out.println("1-�nsert Student.");					//
		System.out.println("2-Show Student Information.");			//
		System.out.println("3-Show All Student Information.");		//	
		System.out.println("4-Update Student Information.");		// 	SHOW MENU TO USER.		
		System.out.println("5-Delete Student Information.");		//
		System.out.println("6-Show GPA.");							//
		System.out.println("7-Show the Average GPA.");				//
		System.out.println("-1 To Exit.");							//
	
	}																//End showMenu method.
	
	
	
	public static void insertStudent() throws FileNotFoundException {					//insertStudent method 
		
		String input;																	//For keyboard input.
		int numStudent;																	//For number of students.
		double doubleInput;																//Hold to GPA double type.
		Scanner keyboard = new Scanner(System.in);										//Create Scanner object for keyboard input.
		PrintWriter printWriterStd = new PrintWriter("std.txt");						//Create PrintWriter object print std.txt file.
		PrintWriter printWriterStd1 = new PrintWriter("std1.txt");						//Create PrintWriter object print std1.txt file.	
		PrintWriter printWriterStd2 = new PrintWriter("std2.txt");						//Create PrintWriter object print std2.txt file.
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");	//Create File for reading file.
		
	
		System.out.println("How many student will be enter?");							//Ask the user how many student do you want to add ?
		numStudent = keyboard.nextInt();												//Scan the keyboard input and hold the numStudent variable.
		
		Student [] students = new Student[numStudent];									//Create Student array
		
		System.out.println();															//Empty line
	
	for(int x = 0; x < students.length; x++){											//Circulation all index of array.
		
		students[x] = new Student();													//Create new student.
		
		System.out.print("Name: ");														//Ask student name to user.
		input = keyboard.next();														//Hold the name 
		students[x].setName(input);														//At index of x student objects name fields = input

		System.out.print("Surname: ");													//Ask student surname to user.
		input = keyboard.next();														//Hold the user surname
		students[x].setSurname(input);													//At index of x student objects surname fields = input

		System.out.print("StudentID: ");												//Ask student StudentID to user.
		input = keyboard.next();														//Hold the user StudentID.
		students[x].setstId(input);														//At index of x student objects stId fields = input

		System.out.print("Grade-1: ");													//Ask student Grade-1 to user.
		doubleInput = keyboard.nextDouble();											//Hold the user grade1
		students[x].setGrade1(doubleInput);												//At index of x student objects grade1 fields = doubleInput

		System.out.print("Grade-2: ");													//Ask student Grade-2 to user.
		doubleInput = keyboard.nextDouble();											//Hold the user grade2
		students[x].setGrade2(doubleInput);												//At index of x student objects grade2 fields = doubleInput

		System.out.print("Grade-3: ");													//Ask student Grade-3 to user.
		doubleInput = keyboard.nextDouble();											//Hold the user grade3
		students[x].setGrade3(doubleInput);												//At index of x student objects grade3 fields = doubleInput

		System.out.print("Grade-4: ");													//Ask student Grade-4 to user.
		doubleInput = keyboard.nextDouble();											//Hold the user grade4
		students[x].setGrade4(doubleInput);												//At index of x student objects grade4 fields = doubleInput

		System.out.print("Grade-5: ");													//Ask student Grade-5 to user.
		doubleInput = keyboard.nextDouble();											//Hold the user grade5
		students[x].setGrade5(doubleInput);												//At index of x student objects grade5 fields = doubleInput
		
		/*
		 	This three line uses PrintWriter objects to print file.
		 */
		
		printWriterStd1.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());
		printWriterStd.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());
		printWriterStd2.println("Name: " + students[x].getName() + " Surname: " + students[x].getSurname() + " StudentID: " + students[x].getstId() + " Grade-1: " + students[x].getGrade1() + " Grade-2: " + students[x].getGrade2() + " Grade-3: " + students[x].getGrade3() + " Grade-4: " + students[x].getGrade4() + " Grade-5: " + students[x].getGrade5() + " GPA: " + students[x].getGPA());

		System.out.println();
		
	}
		printWriterStd.close();			
		printWriterStd1.close();		//Closes the files.
		printWriterStd2.close();
		
		
	}
	
	public static void showStudentInfo() throws FileNotFoundException {							//showStudentInfo method header
		String stID;																			//Hold a StudentID.
		Scanner keyboard = new Scanner(System.in);												//Create Scanner object for keyboard input.
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");			//Create File object for read file.
		Scanner scanFileStd = new Scanner(fileStd);												//Create a Scanner object for read file.
		String line;																			//It holds last read string.
		
		System.out.println("Please enter StudentID for show student.");							//Show the message for user.
		stID = keyboard.next();																	//Hold keyboard input.
		
		while(scanFileStd.hasNext()){															//If the file has next line this loop run.
			
			line = scanFileStd.nextLine();														//Assign the text file line to line variable.
			
			if(line.contains(stID)){															//If text file's line contains stID this statement run.
				
				System.out.println(line);														//Show the line.
			}
		}
		scanFileStd.close();																	//Close the file.
		
	}
	
	public static void showAllStudent() throws FileNotFoundException {							//showAllStudent method header.
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");			//Create File object.
		Scanner scanFileStd = new Scanner(fileStd);												//Create Scanner object for read file.
		String line;																			//It holds last read string.						
		
		while(scanFileStd.hasNext()){															//If the file has next line this loop run.
			
			line = scanFileStd.nextLine();														//Assign the text file line to line variable.
			System.out.println(line);															//Show the line.
		}
		scanFileStd.close();																	//Close the file.
		System.out.println();																	//Empty line.
	}
	
	public static void updateStudentInfo() throws FileNotFoundException {						//updateStudentInfo method header.
		
		String line;																			//It holds last read string.
		String input;																			//It holds user keyboard input.
		
		File fileStd1 = new File("//home//thracian//Desktop//StudentSystem//std1.txt");			//Create file object
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");			//Create file object
		Scanner scanStd1 = new Scanner(fileStd1);												//Create Scanner object to read file.
		Scanner keyboard = new Scanner(System.in);												//Create Scanner object for keyboard input.
		Student st = new Student();																//Create a new Student object.
		
		System.out.println("Please enter StID for update:");									//Show message to user.
		input = keyboard.next();																//Hold keyboard input.
		
		while(scanStd1.hasNext()) {																//If the file has next line this loop run.
			
			line = scanStd1.nextLine();															//Assign the text file line to line variable.
			
			
			if(line.contains(input)) {															//If text file's line contains stID this statement run.
				
				System.out.println("**Update this** : " + line);								//Show the user this line will update.
				System.out.println();															//Empty line.
				
				System.out.println("Name:");													//Ask the user new name.
				input = keyboard.next();														//Hold the input
				st.setName(input);																//Student object name field equal input.
				
				System.out.println("Surname:");													//Ask the user new surname.
				input = keyboard.next();														//Hold the input
				st.setSurname(input);															//Student object surname field equal input.
				
				System.out.println("StID:");													//Ask the user new StID.
				input = keyboard.next();														//Hold the input
				st.setstId(input);																//Student object stId field equal input.
				
				System.out.println("Grade-1:");													//Ask the user new Grade-1
				input = keyboard.next();														//Hold the input
				st.setGrade1(Double.parseDouble(input));										//Student object grade1 field equal input.
				
				System.out.println("Grade-2:");													//Ask the user new Grade-2
				input = keyboard.next();														//Hold the input
				st.setGrade2(Double.parseDouble(input));										//Student object grade2 field equal input.
				
				System.out.println("Grade-3:");													//Ask the user new Grade-3
				input = keyboard.next();														//Hold the input
				st.setGrade3(Double.parseDouble(input));										//Student object grade3 field equal input.
				
				System.out.println("Grade-4:");													//Ask the user new Grade-4
				input = keyboard.next();														//Hold the input
				st.setGrade4(Double.parseDouble(input));										//Student object grade4 field equal input.
				
				System.out.println("Grade-5:");													//Ask the user new Grade-5
				input = keyboard.next();														//Hold the input
				st.setGrade5(Double.parseDouble(input));										//Student object grade5 field equal input.
				break;
			}
			
			//Show user new student info.
			System.out.println("Name: " + st.getName() + " Surname: " + st.getSurname() + " StID: " + st.getstId() + " Grade-1: " + st.getGrade1() + " Grade-2: " + st.getGrade2() + " Grade-3: " + st.getGrade3() + " Grade-4: " + st.getGrade4() + " Grade-5: " + st.getGrade5());
		}
		scanStd1.close();	
		
	}
	
	public static void deleteStudent() throws FileNotFoundException {						//deleteStudent method header.
		
		String line;																		//Hold to file line.
		String willDelete;																	//It holds the line that user wants to delete.
		
		PrintWriter temp = new PrintWriter("temp.txt");										//Create a PrintWriter object to write file.
		File tempRead = new File("//home//thracian//Desktop//StudentSystem//temp.txt");		//Create a File object to read file.
		File fileStd = new File("//home//thracian//Desktop//StudentSystem//std.txt");		//Create a File object to read file.
		Scanner keyboard = new Scanner(System.in);											//Create a Scanner object for keyboard input.
		Scanner scanFileStd = new Scanner(fileStd);											//Create a Scanner object for read std.txt
		Scanner scanTemp = new Scanner(tempRead);											//Create a Scanner object for read temp.txt
		
		
		System.out.print("Please select delete student by a number: ");						//Show the message
		willDelete = keyboard.next();														//Hold the StudentID for delete the student.
		

		while(scanFileStd.hasNext()){														//If the file has next line this loop run.
			
			
			line = scanFileStd.nextLine();													//Assign the text file line to line variable.
			
			if(line.contains(willDelete)){													//If line contains willDelete this statement run.
				
				continue;																	//Continue
			}
			
			temp.println(line);																//Write the students in temp file without deleted student.
			
		}
		temp.close();																		//temp file close.
		System.out.println();																//Empty line.
				
		while(scanTemp.hasNext()) {															//If the file has next line this loop run.
			
			line = scanTemp.nextLine();														//Assign the text file line to line variable.
			System.out.println(line);														//Show the temp file's lines to user.
		}
	}
	
	public static void showStudentGPA() throws IOException {								//showStudentGPA method header.
		
		File file = new File("//home//thracian//Desktop//StudentSystem//std.txt");			//Create File onject for read file.
		Scanner scanFile = new Scanner(file);												//Create Scanner object for read file.
		Scanner keyboard = new Scanner(System.in);											//Create Scanner object for keyboard input.
		String ss = null;																	//Create String object for hold part of string.
		String stdID;																		//Create a String object stID for input.
		
		System.out.println("Please enter stdID: ");											//Show the message.
		stdID = keyboard.next();															//Hold the stID input
		
		
		while(scanFile.hasNext()) {															//If the file has next line this loop run.
			
			ss = scanFile.nextLine();														//Assign the text file's line to ss variable.
			
			if(ss.contains(stdID)) {														//If the ss string contains stID this statement run.
				
				String[] parts = ss.split("GPA: ");											//This line create a string array parts split after the GPA.
				System.out.println(parts[1].trim());										//Show the GPA to user.
			}
			
		}
				
	}
	
	public static void calcAverageGPA() throws FileNotFoundException {						//calcAverageGPA method header
		
		File filestd1 = new File("//home//thracian//Desktop//StudentSystem//std1.txt");		//Create File to read.
		Scanner scanFile = new Scanner(filestd1);											//Create a Scanner object for read std1.txt
		String ss = null;																	//Create a String object ss and assign null.
		double gpa;																			//Hold to gpa
		double sum = 0;																		//Accumulator 
		int count = 0;																		//Hold the number of gpa
		double average = 0;																	//Hold the average GPA.
		
		while(scanFile.hasNext()) {															//If the file has next line this loop run.
			
			ss = scanFile.nextLine();														//Assign the text file's line to ss variable.
			count++;																		//Count + 1
			String[] parts = ss.split("GPA: ");												//This line create a string array parts split after the GPA.
					
			gpa = Double.parseDouble(parts[1].trim());										//Assign GPA variable 
			sum = sum + gpa;																//Calculate total.
			average = sum / count;															//Calculate the average of GPA.
			
			
		}
		System.out.println("Average of GPA is : " + average);								//Show message to user.
		System.out.println();																//Empty line.
				
		
	}
	
}
