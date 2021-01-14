package AnIncompleteAthlete;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
		String answer = "";

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String element : participant) {
			if(hm.containsKey(element)) {
				hm.put(element, hm.get(element) + 1);
			}
			else 
				hm.put(element, 1);
		}
		
		for(String element : completion) {
			if(hm.containsKey(element)) {
				hm.put(element, hm.get(element) - 1);
			}
			else 
				continue;
		}
		
		Iterator<String> ir = hm.keySet().iterator();
		while(ir.hasNext()) {
			String temp = ir.next();
			if(hm.get(temp) == 1)
				answer = temp;
		}
		System.out.println(answer);
	}
}

/* https://programmers.co.kr/learn/courses/30/lessons/42576?language=java */
