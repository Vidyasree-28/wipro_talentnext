package testpackage;

import java.util.Scanner;

public class Package1 {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        foundation f = new foundation();

	        System.out.print("Enter value for var4 (public variable): ");
	        int input = sc.nextInt();
	        f.var4 = input;

	        System.out.println("You entered var4 as: " + f.var4);

	        sc.close();
	    }
	}

	

