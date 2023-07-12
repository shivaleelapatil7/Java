package theFinanceCalculator;

import java.util.Scanner;

public class FinanceCalculator {
	
	public static void main(String [] args)
	{
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter a P value, Time and Rate:");

	double p=scan.nextDouble();
	double t =scan.nextDouble();
	double r=scan.nextDouble();
	
	FinanceCalculator fc=new FinanceCalculator();

	System.out.printf("%.2f",fc.calculateSimpleInterest(p,t,r));
	scan.close();
	}

	
	
	
	public double calculateSimpleInterest(double principal, double rate, double time)
	{
		return (principal*rate*time);
	}

}
