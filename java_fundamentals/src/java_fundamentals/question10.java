package java_fundamentals;
import java.util.*;
public class question10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(Character.isLowerCase(ch)) {
		ch=Character.toUpperCase(ch);
		}
	else if(Character.isUpperCase(ch)) {
		ch=Character.toLowerCase(ch);
	}

     System.out.println(ch); 
}
}
