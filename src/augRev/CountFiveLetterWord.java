package augRev;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class CountFiveLetterWord {

	public static void main(String[] args)
	{
		List<String> ls = Arrays.asList("Mango", "Banana", "Apple", "Orange");
		
		List<String> lt = ls.stream().filter(x -> x.length() == 5).collect(Collectors.toList());
		
		System.out.println(lt);
	}
}
