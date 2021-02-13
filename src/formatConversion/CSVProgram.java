package formatConversion;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import util.*;

public class CSVProgram {
	public static String infoEntered;
	public static Scanner n = new Scanner(System.in);
	public static int x = -1;
	public static int nCount = 0;
	public static final String FILENAME = "out.csv";
	
	public static void csvPrinter(Object object){

		try {
			FileWriter out = new FileWriter(FILENAME,false);
			BufferedWriter bw = new BufferedWriter(out);
			PrintWriter printer = new PrintWriter(bw);
			for(int i = 0; i<= nCount; i++)
			printer.println(object);
			printer.flush();
			printer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	
	public static int getNCount()	{
		return nCount;
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
		
		Object[][] finalList = UserInput.inputCheck();
		
		for(int x = 0; x<= nCount - 1; x++)	{
			if(finalList[0][x].equals("Student")){
				//System.out.println("Student");
				Student student = new Student();
				String nameTemp = finalList[1][x].toString();
				int studentID = Integer.parseInt(finalList[2][x].toString());
				long phone = Long.parseLong(finalList[4][x].toString());
				student.setName(nameTemp);
				student.setStudentID(studentID);
				student.setPhone(phone);
				student.csvPrintln();
			}
			else if(finalList[0][x].equals("Teacher"))	{
				//System.out.println("Teacher!");
				Teacher teacher = new Teacher();
				String nameTemp = finalList[1][x].toString();
				int teacherID = Integer.parseInt(finalList[3][x].toString());
				long phone = Long.parseLong(finalList[4][x].toString());				
				teacher.setName(nameTemp);
				teacher.setPhone(phone);
				teacher.setTeacherID(teacherID);
				teacher.csvPrintln();
				
			}
			else if(finalList[0][x].equals("TA"))	{
				//System.out.println("TA");
				TA ta = new TA();
				String nameTemp = finalList[1][x].toString();
				int studentID = Integer.parseInt(finalList[2][x].toString());
				//int teacherID = Integer.parseInt(finalList[3][x].toString());
				long phone = Long.parseLong(finalList[4][x].toString());
				ta.setName(nameTemp);
				ta.setStudentID(studentID);
				ta.setPhone(phone);
				ta.csvPrintln();
			}
			
			else {
				System.out.println("None!");
			}
			

	}
	

	
	
	/*public static void startProgram() {
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
	}*/
	

	
	}	
}