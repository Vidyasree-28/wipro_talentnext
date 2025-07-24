package oops;
import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()<=2) {
			System.out.println(" ");
		}
		else {
		String result=str.substring(1,str.length()-1);
		System.out.println(result); 

	}

}
}
