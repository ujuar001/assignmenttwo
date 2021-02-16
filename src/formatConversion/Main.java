package formatConversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
	public static final String FILENAME = "out.csv";
	static ArrayList<Object> finalPrintInfo = new ArrayList<Object>();
	
	// row is broken into different variables
	public static void main(String args[]){
		CSVProgram.startProgram();
		
		stringsTOCSV(finalPrintInfo);
		
		
		
	}
	
	public static void csvPrinter(Object object)	{
		finalPrintInfo.add(object);
	}
	
	public static void stringsTOCSV(Object object){

		try {
			FileWriter out = new FileWriter(FILENAME);
			BufferedWriter bw = new BufferedWriter(out);
			PrintWriter printer = new PrintWriter(bw);
			
			for(int x = 0; x <= finalPrintInfo.size() - 1; x++)	{
				
			printer.println(finalPrintInfo.get(x));

			printer.flush();

			}
			printer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
		
	}
	

		//System.out.println(cvsList);
		

}