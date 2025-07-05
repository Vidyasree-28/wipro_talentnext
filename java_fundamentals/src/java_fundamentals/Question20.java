package java_fundamentals;
import java.util.*;
public class Question20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	 if (input.isEmpty()) {
         System.out.println("Enter a valid number");
         return;
     }

     int rows;
     try {
         rows = Integer.parseInt(input); // Try converting input to integer
     } catch (NumberFormatException e) {
         System.out.println("Enter a valid number");
         return;
     }
	
		
	
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
