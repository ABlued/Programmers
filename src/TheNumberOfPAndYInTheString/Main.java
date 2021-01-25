package TheNumberOfPAndYInTheString;

public class Main {
	public static void main(String[] args) {
		String s = "PpYasdasdssay";
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if(a == 'p' || a == 'P') result++;
			else if(a == 'y' || a == 'Y') result--;
			
		}
		System.out.println(result);
	}
}

// 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12916