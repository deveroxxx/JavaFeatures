package java8.defaultmethods;

public interface InterfaceChildA extends InterfaceA  {

	default void foo() {
		System.out.println("InterfaceChildA A");
	}

}
