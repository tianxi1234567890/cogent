
import java.io.*;import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		

		/*1.	Print Fibonacci sequence;
		2.	Print name and address
		3.	Print odd or even number;
		4.	Print prime numbers
		5.	Print Temperature Conversion from (F to C)
*/	
		

		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		String a=name;
		System.out.println("Enter the address:");
		String address=sc.next();
		String b=address;
		System.out.println(a+" "+b);
		}
}