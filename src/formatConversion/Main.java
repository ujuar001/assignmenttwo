package formatConversion;

import util.*;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	// public static final String INPUT_FOLDER =
	// System.getProperty("user.dir")+"/input/";
	public static final String OUTPUT_FOLDER = System.getProperty("user.dir") + "/formatConversion/Output/";
	public static String infoEntered;
	public static Scanner n = new Scanner(System.in);
	public static int x = -1;
	public static int nCount = 0;
	
	// row is broken into different variables

	
	
	public static void main(String args[]) throws FileNotFoundException {
		startProgram();
		inputCheck(); 

	}
	
	public static void startProgram() {
		boolean error = false;
		do
		{
			error = false;
			try {
				System.out.println("Please enter the amount 'n'");
				nCount = n.nextInt();
			}
			catch(Exception e){
				System.out.println("Please enter a number!");
				error = true;
				n.nextLine();
			}
		}while(error);
	}
	
	public static void inputCheck()	{
		String position;
		  String name;
		  String studentID;
		  String teacherID;
		  String phone;

	
		/*
		boolean error = false;
		do
		{
			error = false;
			try {
				System.out.println("Please enter the amount 'n'");
				nCount = n.nextInt();
			}
			catch(Exception e){
				System.out.println("Please enter a number!");
				error = true;
				n.nextLine();
			}
		}while(error);
			*/
		
		
		
		
		//
		Object[][] csvList = new Object[5][nCount];	
		for (int i = 0; i <= nCount - 1; i++) {
			System.out.println("Please enter: Position, Name, StudentID, TeacherID, Phone#");
			Scanner row = new Scanner(System.in);
			String info = row.nextLine();
			String[] split = info.split(" ");
			x = -1;

			//validate position input
			position = split[0];
			while (x == -1) {
				try {
					if (!(position.equals("Student") || position.equals("Teacher") || position.equals("TA"))) {
						throw new MyExceptions();
					} else {
						x++;
					}

				} catch (MyExceptions e) {

					System.out.println(e.getMessage());
					System.out.println("Please re-enter position for row " + i);
					position = row.nextLine();

				}
			}
			// name verification
			name = split[1];
			x = -1;

			while (x == -1) {
				try {
					if (!(name.matches("[a-zA-Z]*" + "," + "[a-zA-Z]*"))) {
						throw new MyExceptions();
					} else {
						x++;
					}

				} catch (MyExceptions e) {

					System.out.println(e.getMessage());
					System.out.println("Please re-enter FirstName,LastName for row " + i);
					name = row.nextLine();

				}
			}
			// StudentID verification
			studentID = split[2];
			x = -1;

			while (x == -1) {
				try {
					if (studentID.equals("0")) {
						x++;
					} else if(!(studentID.matches("[0-9]+") && studentID.length() == 5)){
						throw new MyExceptions();
					}else {
						x++;
					}

				} catch (MyExceptions e) {

					System.out.println(e.getMessage());
					System.out.println("Please re-enter studentID for row " + i +". If not applicable, please enter a single 0 else enter 5 digits");
					studentID = row.nextLine();

				}

			}
			//teacherID verification
			teacherID = split[3];
			x = -1;

			while (x == -1) {
				try {
					if (teacherID.equals("0")) {
						x++;
					} else if(!(teacherID.matches("[0-9]+") && teacherID.length() == 5)){
						throw new MyExceptions();
					}else {
						x++;
					}

				} catch (MyExceptions e) {

					System.out.println(e.getMessage());
					System.out.println("Please re-enter teacherID for row " + i +". If not applicable, please enter a single 0 else enter 5 digits");
					teacherID = row.nextLine();

				}

			}
			//Phone# check
			phone = split[4];
			x = -1;

			while (x == -1) {
				try {
					if (!(phone.matches("[0-9]+") && phone.length() == 10)) {
						throw new MyExceptions();
					} else {
						x++;
					}

				} catch (MyExceptions e) {

					System.out.println(e.getMessage());
					System.out.println("Please re-enter phone# for row " + i +". There should be at least 10 digits");
					phone = row.nextLine();

				}
				
				

			}
				csvList[0][i] = position;
				csvList[1][i] = name;
				csvList[2][i] = studentID;
				csvList[3][i] = teacherID;
				csvList[4][i] = phone;

		}
		//System.out.println(cvsList);
		System.out.println("Done");
	}

}