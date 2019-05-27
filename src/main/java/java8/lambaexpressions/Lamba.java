package java8.lambaexpressions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In programming, a Lambda expression (or function) is just an anonymous function, i.e.,
 * a function with no name and without being bounded to an identifier.
 * <p>
 * In other words, lambda expressions are nameless functions given as constant values,
 * and written exactly in the place where it’s needed, typically as a parameter to some other function
 */
public class Lamba {


	public static void main(String[] ar) {
		Employee[] employees = {
				new Employee("David"),
				new Employee("Naveen"),
				new Employee("Alex"),
				new Employee("Richard")};

		Arrays.sort(employees, Employee::nameCompare); //Sort by name
		Arrays.sort(employees, (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
		Arrays.sort(employees, Comparator.comparing(Employee::getName)); //

	}
}

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
	}

	public String toString() {
		return name;
	}

	String getName() {
		return name;
	}
}


