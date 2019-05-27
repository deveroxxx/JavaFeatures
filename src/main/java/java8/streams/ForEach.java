package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * The Java forEach is a utility method to iterate over a collection
 * or stream and perform a certain action on each element of it.
 */
public class ForEach {

	public static void main(String[] args) {
		//filterArray();
		//printArray();
		//mapForEach();
		customAction();
	}

	/**
	 * Java program to iterate over all elements of a stream and perform an action.
	 * In this example, we are printing all even numbers.
	 */
	private static void filterArray() {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Consumer<Integer> action = System.out::print;
		numberList.stream().filter(n -> n%2  == 0).forEach(action);
	}

	/**
	 * Java program to iterate over all elements of an arraylist and perform an action.
	 * Here action is as simple as printing out the element in console.
	 */
	private static void printArray() {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Consumer<Integer> action = System.out::print;
		numberList.forEach(action);
	}

	/**
	 * Java program to iterate over all entries of a HashMap and perform an action.
	 * We can also iterate over map keys and values and perform any action on all elements.
	 */
	private static void mapForEach() {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		//1. Map entries
		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		map.entrySet().forEach(action);

		//2. Map keys
		Consumer<String> actionOnKeys = System.out::println;
		map.keySet().forEach(actionOnKeys);

		//3. Map values
		Consumer<Integer> actionOnValues = System.out::println;
		map.values().forEach(actionOnValues);
	}

	/**
	 * We can create custom action methods as well to perform our custom logic for each element in the collection.
	 */
	private static void customAction() {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		Consumer<Map.Entry<String, Integer>> action = entry ->
		{
			System.out.println("Key is : " + entry.getKey());
			System.out.println("Value is : " + entry.getValue());
		};

		map.entrySet().forEach(action);
	}

}
