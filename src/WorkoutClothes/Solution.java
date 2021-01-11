package WorkoutClothes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("n 입력 : ");
		int n = Integer.parseInt(br.readLine());
		int answer = n;
		HashSet<Integer> lost = new HashSet<Integer>();
		System.out.print("lost 배열 입력 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			lost.add(Integer.parseInt(st.nextToken()));
		}
		answer -= lost.size();
		HashSet<Integer> reserve = new HashSet<Integer>();
		System.out.print("reserve 배열 입력 : ");
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			reserve.add(Integer.parseInt(st.nextToken()));
		}

		//여기서부터 solution함수이다

		ArrayList<Integer> ary = new ArrayList<Integer>();

		Iterator<Integer> lostIt = lost.iterator();

		while(lostIt.hasNext()) {
			int valueOfLost = lostIt.next();
			Iterator<Integer> reserveIt = reserve.iterator();

			while(reserveIt.hasNext()) {
				int valueOfReserve = reserveIt.next();
				if(valueOfLost == valueOfReserve || valueOfLost == valueOfReserve - 1 || valueOfLost == valueOfReserve + 1) {
					if(lost.contains(valueOfReserve)) {
						continue;
					}
					else {
						reserve.remove(valueOfReserve);
						ary.add(valueOfLost);
						answer++;
						break;
					}
				}
			}
		}

		for(Integer element : ary) {
			if(lost.contains(element)) {
				lost.remove(element);
			}
		}

		for(Integer element : lost) {
			if(reserve.contains(element)) {
				answer++;
			}
		}
		System.out.println(answer);
		//여기까지 solution함수이다.

				Iterator<Integer> it = lost.iterator();
				while(it.hasNext()) {
					System.out.println("lost : " + it.next());
				}
				it = reserve.iterator();
				while(it.hasNext()) {
					System.out.println("reserve : " + it.next());
				}
	}
}
