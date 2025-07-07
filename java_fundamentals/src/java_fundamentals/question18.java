<<<<<<< HEAD

=======
>>>>>>> 64f5485 (java_fundamentals)
package java_fundamentals;
import java.util.*;
public class question18 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        //System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;         
	            reversed = reversed * 10 + digit; 
	            num = num / 10;              
	        }

	        System.out.println(reversed);
	    }
	}

<<<<<<< HEAD

=======
>>>>>>> 64f5485 (java_fundamentals)
