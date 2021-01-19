package CraneClawGame;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[] = {1,5,3,5,1,2,1,4};
		int answer = 0;
		showAry(board);
		for(int i = 0; i < moves.length; i++) {
			board = pull(board,moves[i] - 1, v);
			showAry(board);
			showVector(v);
			answer = checkDuplicate(v, answer);
			showVector(v);
			System.out.println();
		}
		
		
		System.out.println(answer);
	}
	
	static int[][] pull(int board[][], int row, Vector<Integer> v){
		for(int i  = 0; i < board.length; i++) {
			if(board[i][row] == 0) continue;
			else {
				v.add(board[i][row]);
				board[i][row] = 0;
				break;
			}
		}
		return board;
	}
	static int checkDuplicate(Vector<Integer> v, int answer) {
		if(v.size() < 2) ;
		else {
			if(v.get(v.size() - 1) == v.get(v.size() - 2)) {
				v.remove(v.size()-1);
				v.remove(v.size()-1);
				answer +=2;
			}
		}
		return answer;
	}
	
	
	static void showAry(int board[][]) {
		for(int  i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void showVector(Vector<Integer> v) {
		for(Integer element : v) {
			System.out.print(element);
		}
		System.out.println();
	}
}
/* https://programmers.co.kr/learn/courses/30/lessons/64061?language=java */