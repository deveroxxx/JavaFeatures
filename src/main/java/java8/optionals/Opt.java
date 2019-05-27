package java8.optionals;


import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional is an attempt to reduce the number of null pointer exceptions in Java systems,
 * by adding the possibility to build more expressive APIs considering that sometimes return values are missing.
 * If Optional was there since the beginning, today most libraries and applications would
 * likely deal better with missing return values, reducing the number of null pointer exceptions and
 * the overall number of bugs in general.
 *
 * By using Optional, user is forced to think about the exceptional case.
 * Besides the increase in readability that comes from giving null a name,
 * the biggest advantage of Optional is its idiot-proof-ness.
 * It forces you to actively think about the absent case if you want your program to compile at all,
 * since you have to actively unwrap the Optional and address that failure cases.
 *
 * !!!
 * Optional should be used almost all the time as the return type of functions that might not return a value.
 */
public class Opt {

	public static void main(String[] args) {
		System.out.println(valueIsPresent().isPresent());
		valueIsPresent().ifPresent(System.out::println);
		System.out.println(empty().isPresent());

		System.out.println(valueIsPresent().orElse(10)); // return 10 if not present
		System.out.println(empty().orElse(10)); // return 10 if not present

		System.out.println(nullableOptional(null).isPresent());
		System.out.println(nullableOptional(5).isPresent());

		try {
			Integer integer = empty().orElseThrow(Exception::new);
		} catch (Exception e) {
			System.out.println("Exc");
		}

	}

	private static Optional<Integer> valueIsPresent() {
		return Optional.of(5);
	}

	private static Optional<Integer> empty() {
		return Optional.empty();
	}

	private static Optional<Integer> nullableOptional(Integer integer) {
		return Optional.ofNullable(integer);
	}

}
