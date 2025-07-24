package java_fundamentals;
import java.util.*;
public class que3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	add(sc);
}

private static void add(Scanner sc) {
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=a+b;
	System.out.println("The sum of " +a+ " and " +b+ " is " + sum);
}
}
