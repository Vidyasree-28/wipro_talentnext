package java_fundamentals;
import java.util.*;
public class question11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char code=sc.next().charAt(0);
	switch(code) {
	case 'R':
		System.out.println("Red");
		break;
	case 'B':
		System.out.println("Blue");
		break;
	case 'G':
		System.out.println("Green");
		break;
	case '0':
		System.out.println("Orange");
		break;
	case 'Y':
		System.out.println("Yellow");
		break;
	case 'W':
		System.out.println("White");
		break;
	default:
		System.out.println("Invalid code");
	
	
	}
}
}
