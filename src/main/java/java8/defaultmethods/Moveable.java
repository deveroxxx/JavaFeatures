package java8.defaultmethods;

/**
 * Default methods enable you to add new functionality to the interfaces of your libraries and
 * ensure binary compatibility with code written for older versions of those interfaces.
 */
public interface Moveable {

	default void move(){
		System.out.println("I am moving");
	}
}