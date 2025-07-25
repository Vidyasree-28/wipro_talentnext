// Custom Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class Validateuser {
    public static void main(String[] args) {
        try {
            // Validate number of arguments
            if (args.length != 2) {
                System.out.println("Error: Please provide exactly 2 arguments - name and age.");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);  // May throw NumberFormatException

            // Validate age
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be between 18 and 59.");
            }

            // If valid, print success
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Validation successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

