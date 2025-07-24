package oops;
import java.util.*;
public class Longshort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string:");
	String a=sc.nextLine();
	System.out.println("enter the second string:");
	String b=sc.nextLine();
	String result=getshortlongshort(a,b);
	System.out.println(result);
}
	public static String getshortlongshort(String a,String b) {
	
	if(a.length()<b.length()) {
		return a+b+a;
	}
	else {
		
	
	return b+a+b;
}
	}

}

