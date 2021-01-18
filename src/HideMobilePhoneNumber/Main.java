package HideMobilePhoneNumber;

public class Main {
	public static void main(String[] args) {
		String phone_number = "027778888";
		String answer = "";
		int index = 0;
		
		for(int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
			index = i + 1;
		}
		for(int  i = index; i < (index + 4); i++) {
			answer += String.valueOf(phone_number.charAt(i));			
		}
		System.out.println(answer);
	}
}

//https://programmers.co.kr/learn/courses/30/lessons/12948?language=java