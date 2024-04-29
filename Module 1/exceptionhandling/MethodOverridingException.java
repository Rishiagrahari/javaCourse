package com.altran.training.weekthird.exceptionhandling;

//Class acts as a Base class
class Parent {
	void display() {
		System.out.println("parent");
	}

	void getData() throws RuntimeException {
		System.out.println("Parent Class getData() method");
	}
}

//Class inheriting properties from Parent class
class Child extends Parent {
	/*
	 * If Parent class method does not declare an exception, Child class overridden
	 * method can declare the unchecked exception but can't declare checked
	 * exception.
	 */
	// void display() throws IOException {
	void display() throws ArithmeticException {
		System.out.println("child");
	}

	/*
	 * If Parent class method declares an exception, Child class overridden method
	 * can't declare parent exception but can declare same, subclass exception or no
	 * exception.
	 */
	//void getData() throws Exception 
	void getData() throws RuntimeException {
		System.out.println("Child Class getData() method");
	}

}

public class MethodOverridingException {
	public static void main(String args[]) {
		Parent p = new Child();
		p.display();
		p.getData();
	}
}
