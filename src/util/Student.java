package util;

public class Student implements CSVPrintable{
	private String name;
	protected long phone; 
	private int StudentID;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return StudentID;
	}

	@Override
	public void csvPrintln() {
		String print = getName() + "," + getID() + "," + phone;
		
	}

}
