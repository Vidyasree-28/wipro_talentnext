package oops;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		Scanner th=new Scanner(System.in);
		String input=th.nextLine();
		int length=input.length();
		if(length%2==0) {
			System.out.println(input.substring(0,length/2));
		}
		else {
			System.out.println("null");;
		}
		

	}

}
