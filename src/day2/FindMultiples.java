package day2;

import java.util.Arrays;
import java.util.*;


public class FindMultiples {

	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(1,2,3,4,5,10,15,20,25,33);
		
		ls.stream().filter(n -> n % 5 == 0).forEach(System.out::println);
	}
}
