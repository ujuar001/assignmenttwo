package formatConversion;

import java.util.Scanner;

public class UserInput extends CSVProgram {
	
	public static Object[][] inputCheck()	{
		String position;
		  String name;
		  String studentID;
		  String teacherID;
		  String phone;

		Object[][] csvList = new Object[5][nCount];	
		for (int i = 0; i <= nCount - 1; i++) {
			System.out.println("Please enter: Postion FirstName,LastName studentID teacherID PhoneNumber");
			Scanner row = new Scanner(System.in);//Position, FirstName,LastName, 00000, 00000, 1234567890
			String info = row.nextLine();
			String[] split = info.split(" ");
			x = -1;

			//validates position input
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
						name = name.replaceAll(",", " ");
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
		System.out.println("Done");
		return csvList;
	}
}
