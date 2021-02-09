package formatConversion;

public class MyExceptions extends Exception {
	public MyExceptions(String message)	{
		super(message);
	}
public  MyExceptions()	{
	super("Error in the format entered");
}
}
