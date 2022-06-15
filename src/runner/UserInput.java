package runner;

import java.util.Scanner;

public class UserInput {

	private Scanner scan = new Scanner(System.in);
	private static UserInput instance = null;
	
	// if there isn't an instance of this method open then it will open a new one
	public static UserInput getInstance()
	{
		if(instance == null)
		{
			instance = new UserInput();
		}
		return instance;
	}
	
	// when user calls this method it will just return the nextLine function
	public String getString()
	{
		return scan.nextLine();
	}
	
	public int getInt()
	{
		int value;
		while(true)
		{
			try {
				System.out.println("Please type an integer: ");
				value = Integer.parseInt(scan.nextLine()); // converts the users input from a string to an integer
				return value;
			} catch (NumberFormatException numForExc){
				numForExc.printStackTrace();
			}
		}
	}
	
	public float getFloat()
	{
		float value;
		while(true)
		{
			try {
				System.out.println("Please type a number: ");
				value = Integer.parseInt(scan.nextLine());
				return value;
			} catch (NumberFormatException numForExc){
				numForExc.printStackTrace();
			}
		}
	}
}
