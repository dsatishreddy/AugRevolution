package augRev;

import java.util.stream.Collectors;
import java.util.Map;

public class FreqencyOfChar1 {
	
	public static void main(String[] args)
	{
		String st = "tanishq";
		
		Map<Character, Long> ct = st.chars()
				                    .mapToObj(c -> (char) c)
				                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(ct);
		
	}

}
