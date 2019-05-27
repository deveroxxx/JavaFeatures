package java8.defaultmethods;

public class ImplementTest implements InterfaceA, InterfaceB {


	public static void main(String[] args){
		ImplementTest test = new ImplementTest();
		test.defaultMethod();
		test.defaultMethodOnlyB();
	}


	@Override
	public void defaultMethod() {
		InterfaceA.super.defaultMethod();
	}
}
