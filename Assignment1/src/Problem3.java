import java.io.*;import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		

		/*1.	Print Fibonacci sequence;
		2.	Print name and address
		3.	Print odd or even number;
		4.	Print prime numbers
		5.	Print Temperature Conversion from (F to C)
*/	
		

		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if (num %2==0){
		System.out.println(num + "  " + "is an even number");
		}
		
		else{
			System.out.println(num + "  " + "is an odd number");
		}
	}
	}
