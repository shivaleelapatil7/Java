package theHeighConverter;

import java.util.Scanner;

public class HeightConverter {
	public static void main(String [] args)
	{
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter a Number");

	double num=scan.nextDouble();
	HeightConverter hc=new HeightConverter();

	System.out.printf("%.2f",hc.convertInchesToFeet(num));
	scan.close();
	}
	
	public double convertInchesToFeet(double inches) 
	{
		return inches/12;
		
	}

}

