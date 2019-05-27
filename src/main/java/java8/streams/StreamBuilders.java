package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders
{
	public static void main(String[] args)
	{
		test();
	}

	private static void streamOf() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(System.out::println);
	}

	private static void streamOfArray() {
		Integer[] array = new Integer[]{1,2,3,4,5,6,7,8,9};
		Stream<Integer> stream = Stream.of(array);
		stream.forEach(System.out::println);
	}

	private static void streamOfList() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
	}

	private static void streamOfChars() {
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(System.out::println);
		//OR
		Stream<String> s2 = Stream.of("A$B$C".split("\\$"));
		s2.forEach(System.out::println);
	}

	private static void streamToColletcion() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
	}

	private static void streamToArray() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.print(Arrays.toString(evenNumbersArr));
	}

	private static void test() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		Optional<String> reduced = memberNames.stream()
				.reduce((s1,s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);
	}
}
