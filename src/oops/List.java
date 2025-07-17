package oops;
import java.util.*;
public class List {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> names=new ArrayList<>();
	int n=sc.nextInt();
	//sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++) {
		System.out.println(i+1);
		names.add(sc.nextLine());
		
	}
	StringJoiner joiner=new StringJoiner(",","{","}");
	for(String name:names) {
	//CharSequence name;
	joiner.add(name);
}
    System.out.println(joiner.toString());
  }
}
