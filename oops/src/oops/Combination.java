package oops;
import java.util.*;
public class Combination {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	String merged=mergedAlternate(a,b);
	System.out.println(merged);
}

public static String mergedAlternate(String a, String b) {
	StringBuilder result=new StringBuilder();
	int length=Math.max(a.length(),b.length());
	for(int i=0;i<length;i++) {
		if(i<a.length()) {
			result.append(a.charAt(i));
		}
		if(i<b.length()) {
			result.append(b.charAt(i));
		}
	}
	return result.toString();
	
}
}
