package oops;
import java.util.*;
public class Joiner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of cities in s1: ");
	        int n1 = sc.nextInt();
	        sc.nextLine();  
	        StringJoiner s1 = new StringJoiner("-");
	        for (int i = 0; i < n1; i++) {
	            System.out.print("Enter city " + (i + 1) + " for s1: ");
	            s1.add(sc.nextLine());
	        }

	       
	        System.out.print("Enter number of cities in s2: ");
	        int n2 = sc.nextInt();
	        sc.nextLine();  
	        StringJoiner s2 = new StringJoiner("-");
	        for (int i = 0; i < n2; i++) {
	            System.out.print("Enter city " + (i + 1) + " for s2: ");
	            s2.add(sc.nextLine());
	        }

	        
	        StringJoiner mergedS1ToS2 = new StringJoiner("-");
	        mergedS1ToS2.merge(s1);
	        mergedS1ToS2.merge(s2);

	        
	        StringJoiner mergedS2ToS1 = new StringJoiner("-");
	        mergedS2ToS1.merge(s2);
	        mergedS2ToS1.merge(s1);

	      
	        System.out.println("\ni) s1 merged to s2:");
	        System.out.println(mergedS1ToS2.toString());

	        System.out.println("\nii) s2 merged to s1:");
	        System.out.println(mergedS2ToS1.toString());
	    }
}

