package util;

import formatConversion.CSVProgram;
import formatConversion.Main;

public class Student implements CSVPrintable{
	 private String name;
	 protected long phone; 
	 private int studentID;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return studentID;
	}

	@Override
	public void csvPrintln() {
		String print = getName() + "," + getID() + "," + phone;
		Main.csvPrinter(print);
		System.out.println(print);
		
	}
	public void setName(String name)	{
		this.name = name;
	}
	
	public void setPhone(long phone)	{
		this.phone = phone;
	}
	
	public void setStudentID(int studentID)	{
		this.studentID = studentID;
	}

}
