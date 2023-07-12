package theTimeConverter;
import java.util.Scanner;

public class TimeConverter 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter minutes:");
		int mnts= scan.nextInt();
		TimeConverter tc=new TimeConverter();
		System.out.printf("%.2f",tc.convertToHours(mnts));
		scan.close();
	}
	
	public static double convertToHours(double minutes)
	{
		return minutes/60;
	}
	

}
