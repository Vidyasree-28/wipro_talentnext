package oops;

import java.util.Scanner;

public class Copies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		String firstTwo=str.length() >=2?str.substring(0,2):str;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<length;i++) {
        	result.append(firstTwo);
        }
        System.out.println(result.toString());
	}

}
