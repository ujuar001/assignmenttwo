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
			String [] split = info.split(" ");
			System.out.println(split[0]);
			int x = -1;
			
			position = split[0];
			while(x == -1) {
			try {
				if(!(position.equals("Student") || position.equals("Teacher") || position.equals("TA"))) {
					throw new MyExceptions();
				}
				else {
					x++;
				}

			}
			catch(MyExceptions e)	{
			
				System.out.println(e.getMessage());
				System.out.println("Please re-enter position for row " + i);
				position = row.nextLine();
				
				
			}
		}
			name = split[1];
			x = -1;
			
			while(x == -1) {
				try {
					if(name.matches(info)) {
						throw new MyExceptions();
					}
					else {
						x++;
					}

				}
				catch(MyExceptions e)	{
				
					System.out.println(e.getMessage());
					System.out.println("Please re-enter position for row " + i);
					position = row.nextLine();
					
					
				}
			}
			
			
			
		}
		
		
		
		
		

	}

}
