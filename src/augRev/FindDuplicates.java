package augRev;

import java.util.Arrays;
import java.util.*;

public class FindDuplicates {
	
	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,4,2);
		
		/*
		 * List<Integer> lt = ls.stream() .distinct() .collect(Collectors.toList());
		 * 
		 * System.out.println(lt);
		 */
		
		Set<Integer> st = new HashSet<>();
		
		ls.stream().filter(n -> !st.add(n)).forEach(System.out::println);
		
		
	}

}
