<<<<<<< HEAD

=======
>>>>>>> 64f5485 (java_fundamentals)
package java_fundamentals;

import java.util.Scanner;

public class question15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+ " is a prime");
		}
		else {
			System.out.println(num+ " is not a prime");
		
		
	}
}

public static boolean isPrime(int n) {
	if(n<2)
	return false;
	for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0)
            return false;
    }
	return true;
}
}
<<<<<<< HEAD

=======
>>>>>>> 64f5485 (java_fundamentals)
