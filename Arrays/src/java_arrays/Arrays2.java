package java_arrays;
import java.util.*;

public class Arrays2 {
public static void main(String[] args) {
	int[] numbers= {4,15,34,2,46};
	int min=numbers[0];
	int max=numbers[0];
	for(int i=1;i<numbers.length;i++) {
		if(numbers[i]<min) {
			min=numbers[i];
		}
		if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	System.out.println("Minimum value"+min);
	System.out.println("maximum value"+max);
}
}
