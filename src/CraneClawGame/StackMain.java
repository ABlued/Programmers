//Stack을 사용하여 푼 코드이다
package CraneClawGame;

import java.util.Stack;

public class StackMain {
//	public static void main(String[] args) {
//		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//		int moves[] = {1,5,3,5,1,2,1,4};
//		int answer = 0;
//		Stack<Integer> stack = new Stack<>();
//	    stack.push(0);
//
//	    for (int move : moves) {
//	      for (int j = 0; j < board.length; j++) {
//	        if (board[j][move - 1] != 0) {
//	          if (stack.peek() == board[j][move - 1]) {
//	            stack.pop();
//	            answer += 2;
//	          } else {
//	           stack.push(board[j][move - 1]);
//	          }
//	          board[j][move - 1] = 0;
//	          break;
//	        }
//	      }
//	    }
//	}
}


//public Element push(Element item); // 데이터 추가
//public Element pop(); // 최근에 추가된(Top) 데이터 삭제
//public Element peek(); // 최근에 추가된(Top) 데이터 조회
//public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
//public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음