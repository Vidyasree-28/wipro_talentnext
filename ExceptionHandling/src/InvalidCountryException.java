class InvalidCountryException extends Exception {
	    // Default constructor
	    public InvalidCountryException() {
	        super("User Outside India cannot be registered");
	    }

	    // Constructor with custom message
	    public InvalidCountryException(String message) {
	        super(message);
	    }
	}

