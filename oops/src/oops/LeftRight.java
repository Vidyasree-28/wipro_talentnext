package oops;
import java.util.*;
public class LeftRight {

	public static void main(String[] args) {
		Scanner th=new Scanner(System.in);
		String str=th.nextLine();
		String result=LeftRight(str);
		System.out.println(result);
		
	}

	public static String LeftRight(String str) {
		StringBuilder result=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='*') {
				continue;
			}else if(i>0 && str.charAt(i-1)=='*') {
				continue;
			}else if(i<n-1 && str.charAt(i+1)=='*') {
				continue;
			}else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

}
