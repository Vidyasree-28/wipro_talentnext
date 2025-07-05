package java_fundamentals;
import java.util.*;
public class Question17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	int a=num;
	while(num!=0) {
		sum+=num%10;
		num=num/10;
	}
	System.out.println("sum of digits "+a+ " is: "+sum);
}
}
