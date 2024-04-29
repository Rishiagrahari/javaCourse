package com.altran.training.weekthird.exceptionhandling;

class AgeException extends Exception {
	int age;

	AgeException(String message) {
		super(message);
	}

	AgeException() {
		super();
	}
}

class OutOfAgeLimitException extends AgeException {
	int ageLimit;

	OutOfAgeLimitException(int ageLimit, String message) {
		super(message);
		this.ageLimit = ageLimit;
	}

	OutOfAgeLimitException(String message) {
		super(message);
	}
}

class TooYoungException extends OutOfAgeLimitException {
	TooYoungException(int age, int ageLimit, String message) {
		super(ageLimit, "You are too young to " + message + ".");
		this.age = age;
	}

	TooYoungException() {
		super("Too young");
	}
}

class TooOldException extends OutOfAgeLimitException {
	TooOldException(int age, int ageLimit, String message) {
		super(ageLimit, "You are too old to " + message + ".");
		this.age = age;
	}

	TooOldException() {
		super("Too Old");
	}
}

class IllegalAgeFormatException extends AgeException {
	IllegalAgeFormatException(String message) {
		super(message);
	}

	IllegalAgeFormatException() {
		super("Illegal Age Format");
	}
}

class NegativeAgeException extends IllegalAgeFormatException {
	NegativeAgeException(String message) {
		super(message);
	}

	NegativeAgeException(int age) {
		super("Age must be non-negative");
		this.age = age;
	}
}

class UserDefinedException1 {
	static void rideRollerCoasterAtAge(int age) {
		try {
			System.out.println("Trying to ride a Roller Coaster Ride at the age of " + age);
			if (age == 0) {
				throw new IllegalAgeFormatException("You need to exist to ride the Roller Coaster");
			} else if (age < 0) {
				throw new NegativeAgeException(age);
			} else if (age < 10) {
				throw new TooYoungException(age, 9, " ride a roller coaster");
			} else if (age > 80) {
				throw new TooOldException(age, 81, " ride a roller coaster");
			} else
				System.out.println(" Riding the roller coaster ride....");
		} catch (IllegalAgeFormatException e) {
			System.out.println(e.getMessage());
		}

		catch (TooYoungException e) {
			System.out.println(e.getMessage());
		} catch (TooOldException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		int age = -9;
		UserDefinedException1.rideRollerCoasterAtAge(age);

	}
}
