package oops;
import java.util.Optional;

class Employee2 {
    private String name;

    public Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

 class OptionalExample {
    public static void main(String[] args) {
        Employee employee = null;

        try {
            Employee validEmployee = Optional.ofNullable(employee)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee cannot be null"));

            System.out.println("Employee name: " + validEmployee.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        Employee employee2 = new Employee("Sumith", 0, 0, null);

         try {
            Employee validEmployee = Optional.ofNullable(employee2)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee cannot be null"));

            System.out.println("Employee name: " + validEmployee.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
