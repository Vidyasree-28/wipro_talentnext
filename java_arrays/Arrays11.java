package java_arrays;
import java.util.*;
public class Arrays11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	boolean isvalid=true;
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		if(arr[i] != 1 && arr[i] != 4) {
			isvalid = false;
	}
}
	System.out.println(isvalid? "True" : "False");
}
}
