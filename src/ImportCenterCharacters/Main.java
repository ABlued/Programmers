package ImportCenterCharacters;

public class Main {
	public static void main(String[] args) {
		String input = "abcdef";
		String answer = "";
		int index = (input.length() / 2);
		if(input.length() % 2 == 1) {
			answer = String.valueOf(input.charAt(index));
		}
		else {
			answer = String.valueOf(input.charAt(index - 1)) + String.valueOf(input.charAt(index));
		}
		System.out.println(answer);
	}
}

//https://programmers.co.kr/learn/courses/30/lessons/12903?language=java