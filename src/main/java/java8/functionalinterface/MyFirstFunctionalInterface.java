package java8.functionalinterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface
{
	void firstWork();

	default void doSomeMoreWork1(){
		//Method body
	}

	default void doSomeMoreWork2(){
		//Method body
	}
}