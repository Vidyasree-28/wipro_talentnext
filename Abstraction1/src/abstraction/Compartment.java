package abstraction;
	import java.util.Random;

	// Abstract class Compartment
	abstract class Compartment {
	    public abstract String notice();
	}

	// FirstClass compartment
	class FirstClass extends Compartment {
	    public String notice() {
	        return "First Class Compartment: Reserved for passengers with first-class tickets.";
	    }
	}

	// Ladies compartment
	class Ladies extends Compartment {
	    public String notice() {
	        return "Ladies Compartment: Reserved for female passengers.";
	    }
	}

	// General compartment
	class General extends Compartment {
	    public String notice() {
	        return "General Compartment: Open for all passengers.";
	    }
	}

	// Luggage compartment
	class Luggage extends Compartment {
	    public String notice() {
	        return "Luggage Compartment: For luggage transport only.";
	    }
	}

	// TestCompartment class with main method
	public class TestCompartment {
	    public static void main(String[] args) {
	        Compartment[] compartments = new Compartment[10];
	        Random rand = new Random();

	        // Fill array with randomly chosen compartments
	        for (int i = 0; i < compartments.length; i++) {
	            int randomType = rand.nextInt(4) + 1; // generates 1 to 4
	            switch (randomType) {
	                case 1:
	                    compartments[i] = new FirstClass();
	                    break;
	                case 2:
	                    compartments[i] = new Ladies();
	                    break;
	                case 3:
	                    compartments[i] = new General();
	                    break;
	                case 4:
	                    compartments[i] = new Luggage();
	                    break;
	            }
	        }

	        // Display the notice for each compartment
	        for (int i = 0; i < compartments.length; i++) {
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }
	    }
	}


