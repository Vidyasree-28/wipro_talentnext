import java.util.Scanner;
	class NegativeValueException extends Exception {
	    public NegativeValueException(String message) {
	        super(message);
	    }
	}
	class OutOfRangeException extends Exception {
	    public OutOfRangeException(String message) {
	        super(message);
	    }
	}

	public class Studentmarkaverage {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final int NUM_SUBJECTS = 3;

	        for (int student = 1; student <= 2; student++) {
	            try {
	                System.out.println("Enter name of student " + student + ":");
	                String name = scanner.nextLine();

	                int total = 0;
	                for (int subject = 1; subject <= NUM_SUBJECTS; subject++) {
	                    System.out.println("Enter marks for subject " + subject + ":");
	                    String input = scanner.nextLine();

	                    // May throw NumberFormatException
	                    int mark = Integer.parseInt(input);

	                    // Check for negative mark
	                    if (mark < 0) {
	                        throw new NegativeValueException("Negative marks are not allowed: " + mark);
	                    }

	                    // Check for marks out of range
	                    if (mark > 100) {
	                        throw new OutOfRangeException("Marks should be between 0 and 100: " + mark);
	                    }

	                    total += mark;
	                }

	                double average = total / (double) NUM_SUBJECTS;
	                System.out.println("Average marks for " + name + ": " + average);

	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input! Please enter integer values only.");
	            } catch (NegativeValueException | OutOfRangeException e) {
	                System.out.println("Error: " + e.getMessage());
	            }

	            System.out.println("---------------------------");
	        }

	        scanner.close();
	    }
	}



