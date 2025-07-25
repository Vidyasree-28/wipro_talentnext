import java.util.Scanner;

	public class ArrayAccessWithExceptionHandling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Read number of elements
	            System.out.println("Enter the number of elements in the array");
	            int n = Integer.parseInt(scanner.nextLine());
	            int[] arr = new int[n];

	            // Read elements
	            System.out.println("Enter the elements in the array");
	            for (int i = 0; i < n; i++) {
	                arr[i] = Integer.parseInt(scanner.nextLine());
	            }

	            // Read index to access
	            System.out.println("Enter the index of the array element you want to access");
	            int index = Integer.parseInt(scanner.nextLine());

	            // Access and display the element
	            System.out.println("The array element at index " + index + " = " + arr[index]);
	            System.out.println("The array element successfully accessed");

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e.toString());
	        } catch (NumberFormatException e) {
	            System.out.println(e.toString());
	        }

	        scanner.close();
	    }
	}


