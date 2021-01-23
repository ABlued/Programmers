package NumberOfCountries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		String[] numbers = {"4", "1", "2"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String answer = "";
		while(n > 0) {
			int rest = n % 3;
			n /= 3;
			if(rest == 0) n--;
			
			answer = numbers[rest] + answer;
		}
		System.out.println(answer);
	}
}


// 문제풀이 : https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-124-%EB%82%98%EB%9D%BC%EC%9D%98-%EC%88%AB%EC%9E%90-Java

//	https://programmers.co.kr/learn/courses/30/lessons/12899?language=java