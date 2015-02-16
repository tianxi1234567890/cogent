import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		

		/*1.	Print Fibonacci sequence;
		2.	Print name and address
		3.	Print odd or even number;
		4.	Print prime numbers
		5.	Print Temperature Conversion from (F to C)
*/	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int limit=sc.nextInt();
		
	         for(int number = 2; number<=limit; number++){
	             if(isPrime(number)){
	                 System.out.println(number);
	             }
	         }
	       }
	       public static boolean isPrime(int number){
	           for(int i=2; i<number; i++){
	              if(number%i == 0){
	                  return false; 
	              }
	           }
	           return true; 

	       }
	}

	