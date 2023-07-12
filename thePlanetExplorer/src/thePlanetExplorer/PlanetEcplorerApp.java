package thePlanetExplorer;

import java.util.Scanner;

public class PlanetEcplorerApp
	{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter radius value");

		double r =scan.nextDouble();
		PlanetExplorer planetExplorer = new PlanetExplorer();

		System.out.printf("%.2f",planetExplorer.calculateSurfaceArea(r));
		scan.close();
	}

		


}
