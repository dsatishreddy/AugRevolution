package augRev;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
		
		int lt = ls.stream()
				   .filter(n -> n % 2 != 0)
				   .mapToInt(Integer::intValue)
				   .sum();
		
		System.out.println("Odd Numbers Sum: " + lt);
	}

}
