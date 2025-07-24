package oops;
import java.util.*;
public class Unchanged {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.nextLine();
	int start=0;
	int end=str.length();
	if(str.startsWith("x")) {
		start=1;
	}
	if(str.endsWith("x")) {
		end=end-1;
		
	}
	String ans=str.substring(start,end);
	System.out.println(ans);
	
	}

}
