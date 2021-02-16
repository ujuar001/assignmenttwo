package formatConversion;

import java.io.BufferedWriter;
import java.io.File;
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
	//public static final String OUTPUT_FOLDER = System.getProperty("user.dir")+"/output/";
	

	
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
				
				//int teacherID = Integer.parseInt(finalList[3][x].toString());
				
				int c = Integer.parseInt(finalList[2][x].toString());
				int d = Integer.parseInt(finalList[3][x].toString());
				int finalID = 0;
				
				if(c > d)	{
					finalID = Integer.parseInt(finalList[2][x].toString());
				}else if(d > c){
					finalID = Integer.parseInt(finalList[3][x].toString());
				}else {
					
				}
				
				
				long phone = Long.parseLong(finalList[4][x].toString());
				ta.setName(nameTemp);
				ta.setStudentID(finalID);
				ta.setPhone(phone);
				ta.csvPrintln();
			}
			
			else {
				System.out.println("None!");
			}
			

	}
	
	

	
	}	
}