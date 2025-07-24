package oops;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter two strings separated by a comma: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please enter in the format: str1,str2");
            return;
        }

        String str1 = parts[0].trim().toLowerCase();
        String str2 = parts[1].trim().toLowerCase();

        String result;

        if (str1.endsWith(str2.substring(0, 1))) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + " " + str2;
        }

        System.out.println(result);
    }
}
