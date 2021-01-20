package DividedNumberArrangement;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int arr[] = {3,2,6};
		int divisor = 10;
		int[] answer = {};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int element : arr) 
			if(element % divisor == 0) 
				ts.add(element);
			
		if(ts.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
		
		else {	
			answer = new int[ts.size()];
			Iterator<Integer> it = ts.iterator();
			int i = 0;
			while(it.hasNext()) 
				answer[i++] = it.next();		
		}
		
		for(int element : answer) 
			System.out.println(element);
		
	}
}
