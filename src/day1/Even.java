package day1;

import java.util.Arrays;
import java.util.*;

public class Even {
	
	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
		
		ls.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		
	}

}
