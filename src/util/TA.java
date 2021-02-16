package util;

import formatConversion.CSVProgram;
import formatConversion.Main;

public class TA extends Student{
	
	
	
	public void csvPrintln()	{
		String print = getName() + "," + getID() + "," + phone;
		Main.csvPrinter(print);
		System.out.println(print);
	}
	
	
}
