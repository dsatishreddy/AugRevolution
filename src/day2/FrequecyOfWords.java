package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class FrequecyOfWords {
	
	public static void main(String[] args)
	{
		List<String> st = Arrays.asList("Rudvi", "Tanishq", "Sreeni", "Rudvi", "tanishq");
		
		Map<String, Long> fw = st.stream().map(String::toLowerCase)
				                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(fw);
		
	}

}
