package formatConversion;
import util.*;

import java.io.FileNotFoundException;
import java.util.*;
public class Main {

	//public static final String INPUT_FOLDER = System.getProperty("user.dir")+"/input/";
	public static final String OUTPUT_FOLDER = System.getProperty("user.dir")+"/formatConversion/Output/";
	public static ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
	public static String infoEntered;
	public static void main(String args[]) throws FileNotFoundException {
		Scanner n = new Scanner(System.in);
		System.out.println("Please enter the amount 'n'");
		int nCount= n.nextInt();
		
		//row is broken into different variables
		String position;
		String name;
		int studentID;
		int teacherID;
		String phone;
		
		for(int i = 1; i <= nCount; i++)	{
			System.out.println("Please enter: Position, Name, StudentID, TeacherID, Phone#");
			Scanner row = new Scanner(System.in);
			String info = row.nextLine();	
			String [] splitString = info.split("\\s+");
			System.out.println(info);
			/*
			System.out.println(splitString[0]);
			System.out.println(splitString[1]);
			System.out.println(splitString[2]);
			System.out.println(splitString[3]);
			System.out.println(splitString[4]);
			*/
			
			
			
			
		}
		
		
		
		
		

	}

}
