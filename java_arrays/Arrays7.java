package java_arrays;
import java.util.*;
public class Arrays7 {
public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int []arr = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.print(arr[0]+ " ");
			for(int i =1;i<n;i++) {
				if(arr[i] != arr[i - 1]) {
					System.out.print(arr[i] + " ");
				}
			}
			sc.close();
			

		}

	
}

