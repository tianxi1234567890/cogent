
import java.io.*;import java.util.*;

public class Problem1 {

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
		int number=sc.nextInt();	
		 for(int i=0; i<=number; i++){
			 if (number>fibonacci(i)){
			    System.out.print(fibonacci(i) +" ");}
	        }
			 
	    } 
		
	public static int fibonacci(int number){
		
		if (number==0){
			return 0;
		}
	       
		if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacci(number-1) + fibonacci(number -2); 
        
	
	}

}
