package java8.defaultmethods;

public interface InterfaceA {

	static void foo() {
		System.out.println("Interface A");
	}

	static void method() {
		System.out.println("InterfaceA method");
	}

	default void defaultMethod() {
		System.out.println("InterfaceA default method");
	}



}
