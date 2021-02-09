package util;

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

	@Override
	public void csvPrintln() {
		// TODO Auto-generated method stub
		
	}

}
