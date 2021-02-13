package util;

import formatConversion.CSVProgram;

public class TA extends Student{
	
	
	
	public void csvPrintln()	{
		String print = getName() + "," + getID() + "," + phone;
		CSVProgram.csvPrinter(print);
		System.out.println(print);
	}
	
	
}
