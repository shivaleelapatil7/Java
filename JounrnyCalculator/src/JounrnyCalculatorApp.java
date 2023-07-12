import java.util.Scanner;
public class JounrnyCalculatorApp {
 public static void main(String[] args)
 {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter speed and time:");
	 double speed=scan.nextDouble();
	 double time=scan.nextDouble();
	 JounrnyCalculator jounrnyCalculator= new JounrnyCalculator();
	 System.out.printf("%.2f",jounrnyCalculator.calculateDistance(speed, time));
 }
}
