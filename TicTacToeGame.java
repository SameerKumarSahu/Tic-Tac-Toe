package com.Bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	public static Scanner sc = new Scanner(System.in);
	public static char playerChoice;
	static char board [] = new char[10];

	public void createBoard() {
			for (int position = 1; position < board.length; position++) {
			board[position] = ' ';
		}
	}
	
	public void showBoard() {
		
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println(" ------- ");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println(" ------- ");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
		System.out.println("");
	}
	
	public char chooseInput() {
		System.out.println("Want you want X or O");
		
       char choice=sc.next().charAt(0);
      
       char  computerChoice ;
        if(choice=='X' || choice=='x')
        {
        	playerChoice=choice;
        	computerChoice='O';
            System.out.println("Your choose  "+playerChoice);
            System.out.println("Computer choose "+computerChoice);
        }
        else if(choice=='O' || choice=='o')
        {
        	playerChoice=choice;
        	computerChoice= 'X';
            System.out.println("Your choose "+playerChoice);
            System.out.println("Computer choose "+computerChoice);
        }
        else
            System.out.println("invalid char");
        return 0;
    }
	
//	public void playGame() {
//		
//		int boardLocation;
//		
//			System.out.println("Player Enter the location (1-9) where to put symbol: ");
//			boardLocation = sc.nextInt();
//			
//			
//			board[boardLocation] = playerChoice;
//			showBoard();
//		 
//	}
//	
	public void playerMakeMove( char playerLetter) {
		boolean isPositionFree ;
		int boardLocation;
		do {
			System.out.println("Player Enter the location (1-9) where to put symbol: ");
			boardLocation = sc.nextInt();
			isPositionFree = false;
			if (boardLocation >= 1 && boardLocation <= 9) {
				isPositionFree = checkIfPositionFree(boardLocation);
			} else {
				System.out.println("Invalid position entered.");
			}
		} 
		while (!isPositionFree);
		board[boardLocation] = playerLetter;
		showBoard();
		
	}
	public boolean checkIfPositionFree(int boardLocation) {
		if (board[boardLocation] == ' ') {
			return true;
		} else {
			System.out.println("Already filled");
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Tic Tak Toe Boarder"+"\n");
		
		// creating object for create board
		TicTacToeGame tictactoe = new TicTacToeGame();
			tictactoe.showBoard();
			tictactoe.chooseInput();
			tictactoe.showBoard();
//			tictactoe.playGame();
			tictactoe.playerMakeMove(playerChoice);

	}

}
