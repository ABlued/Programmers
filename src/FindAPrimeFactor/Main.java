package FindAPrimeFactor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 0;
		boolean number[] = new boolean[n + 1];
		for(int i = 0; i <= n; i++) {
			number[i] = true;
		}
		number[0] = number[1] = false;
		for(int i = 2; i <= n; i++) {
			if(number[i] == false) continue;
			for(int j = i + i; j <= n; j+=i) {
				number[j] = false;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			if(number[i] == true) {
				System.out.println(i);
				answer++;
			}
				
		}
	}
}

/* 소수 찾기 : https://programmers.co.kr/learn/courses/30/lessons/12921?language=java*/
