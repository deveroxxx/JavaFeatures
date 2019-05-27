package java8.defaultmethods;

public interface InterfaceB {

	static void foo() {
		System.out.println("Interface A");
	}

	default void defaultMethod() {
		System.out.println("InterfaceB default method");
	}

	default void defaultMethodOnlyB() {
		System.out.println("InterfaceB defaultMethodOnlyB");
	}
}
