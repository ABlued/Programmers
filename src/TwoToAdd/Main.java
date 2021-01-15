package TwoToAdd;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int numbers[] = {5,0,2,7};
		int answer[] = {};
		TreeSet<Integer> ts = new TreeSet<Integer>();			//중복 허용하지않으면서 오름차순으로 정렬되는 자료구조
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(i == j) continue;		//같은 인덱스끼리는 더하지 않으며
				else {
					ts.add(numbers[i] + numbers[j]);		//서로 다른 인덱스에 있는 수는 더하여 TreeSet에 저장된다.
				}
			}
		}
		
		int index = 0;
		answer = new int[ts.size()];
		Iterator<Integer> it = ts.iterator();		//순서가 없는 set은 이터레이터도 순회해야한다.
		
		while(it.hasNext()) {
			answer[index++] = it.next();		//순회하면서 있는 모든 수를 answer에 저장
		}
		
		for(int element : answer) {
			System.out.println(element);
		}
	}
}
//https://programmers.co.kr/learn/courses/30/lessons/68644?language=java