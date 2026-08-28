package day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingWords {

	public static void main(String[] args) {
		
		List<String> ss = Arrays.asList("Apple", "Mango", "banana", "Apple", "Mango");
		
		Map<String, Long> cw = ss.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(cw);

	}

}
