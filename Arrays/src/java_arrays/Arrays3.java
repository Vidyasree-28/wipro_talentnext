package java_arrays;

import java.util.Scanner;

public class Arrays3 {
	public static void main(String[] args) {
		int[] numbers= {1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		int searchElement=sc.nextInt();
		boolean found=false;
		for(int num:numbers) {
			if(num==searchElement) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("3");
		}
		else {
			System.out.println("-1");
		}
		
	}

}
