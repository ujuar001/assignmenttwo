package util;
import formatConversion.CSVProgram;

public class Teacher implements CSVPrintable{
	private String name;
	private int phone;
	private int teacherID;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return teacherID;
	}
	
	public void setName(String name)	{
		this.name = name;
	}
	
	public void setPhone(long phone2)	{
		String lastFour = String.valueOf(phone2);
		lastFour = lastFour.substring(6);
		this.phone = Integer.parseInt(lastFour);
	}
	
	public void setTeacherID(int teacherID)	{
		this.teacherID = teacherID;
	}
	
	
	@Override
	public void csvPrintln() {
		String print = getName() + "," + getID() + "," + phone;
		CSVProgram.csvPrinter(print);
		System.out.println(print);
		
	}

}
