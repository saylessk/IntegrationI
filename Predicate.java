import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicates {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1,-2,-3,-4,-5,1,2,3,4,5);
		List<Integer> filteredNumbers = getFilteredNumber(numbers, IntPredicate.positiveIntegerPredicate);
		filteredNumbers.forEach(System.out::println);
		}
	
	public static List<Integer> getFilteredNumber(List<Integer> numbers, Predicate<Integer> intPredicate) {
		List<Integer> filteredNumbers = new ArrayList<Integer>();
		for (Integer i : numbers) {
			if (intPredicate.test(i)) {
				filteredNumbers.add(i);
			}
		}
		return filteredNumbers;
	}
	
	
	}
	
