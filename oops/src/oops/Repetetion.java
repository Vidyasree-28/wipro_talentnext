package oops;
import java.util.*;
public class Repetetion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int n=sc.nextInt();
	String output=repeatLastN(str,n);
	System.out.println(output);
}

public static String repeatLastN(String str, int n) {
	if(n==0||n>str.length()) {
		return "";
	}
	String lastN=str.substring(str.length()-n);
	StringBuilder result=new StringBuilder();
	for(int i=0;i<n;i++) {
		result.append(lastN);
	}
	return result.toString();
}
}
