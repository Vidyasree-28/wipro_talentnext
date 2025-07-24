<<<<<<< HEAD

=======
>>>>>>> 64f5485 (java_fundamentals)
package java_fundamentals;
import java.util.*;
public class Question19 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int original=num;
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;         
	            reversed = reversed * 10 + digit; 
	            num = num / 10;              
	        }
         if(original==reversed) {
	        System.out.println("palindrome");
	    }
         else {
        	 System.out.println("not a palindrome");
         }
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 64f5485 (java_fundamentals)
