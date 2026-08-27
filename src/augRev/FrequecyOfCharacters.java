package augRev;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecyOfCharacters 
{
  public static void main(String[] args)
  {
	  String input = "sathish";
	  
	  Map<Character, Long> charCount = input.chars()
			                                .mapToObj(c -> (char) c)
			                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	  
	  System.out.println(charCount);
  }
}
