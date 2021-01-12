package IDontLikeTheSameNumber;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {1,2,2,1,1,3,4,3,3};
		int out[] = solution1(arr);

		for(int i = 0; i < out.length;i++) {
			System.out.println(out[i]);
		}


	}
	static int[] solution1(int []arr) {
		int[] answer = {};
		int index = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(arr[0]);
		for(int  i = 1; i < arr.length; i++) {
			if(arr[i] == ary.get(index)) {
				continue;
			}
			else {
				ary.add(arr[i]);
				index++;
			}
		}
		answer = new int[ary.size()];
		index = 0;
		for(Integer element : ary) {
			answer[index] = element;
			index++;
		}
		
		return answer;
	}
}

// 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12906?language=java