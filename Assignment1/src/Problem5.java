import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		/*1.	Print Fibonacci sequence;
		2.	Print name and address
		3.	Print odd or even number;
		4.	Print prime numbers
		5.	Print Temperature Conversion from (F to C)
*/	
		
		 	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int Number=sc.nextInt();
			int NewNum=5*(Number-32)/9;
			System.out.println("Temperature is" + "   " + NewNum +"   " + "Celsius Degree !");
			
		
		}

}


