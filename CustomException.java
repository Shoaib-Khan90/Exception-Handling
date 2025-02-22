package ExceptionHandling;

// Custom exception class

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {

		super(message);

	}
  }

public class CustomException {

	public static void main(String[] args) {

		try {

			checkAge(16); // Throws custom exception

		} 
		
		catch (InvalidAgeException e) 
		{

			System.out.println("Error: " + e.getMessage());

		}
    }

	static void checkAge(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("Age must be 18 or older.");

		}
   }
}

