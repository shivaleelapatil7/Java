package theHalveIt;
import java.util.Scanner;

public class HalveIt {
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number:");
		double num=scan.nextDouble();
		HalveIt ht=new HalveIt();
		System.out.printf("%.2f",ht.halveTheNumber(num));
		scan.close();
	}
	
	
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}
