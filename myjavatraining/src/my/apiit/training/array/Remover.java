package my.apiit.training.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remover {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 5, 5, 5, 5, 5, 8};
		
		Object[] l = Remover.duplicate(numbers);
		for (int i = 0; i < l.length; i++) {
			System.out.println( l[i] );
		}
		
		
	}
	
	public static Object[] duplicate( int[] arr ) {
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}
		return set.toArray();
		
	}
	
}
