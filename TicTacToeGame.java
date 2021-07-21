package com.Bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

static char[] board = new char[10];
	
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
	
	public static char chooseInput(Scanner scan) {
		System.out.println(" Choose a letter either 'X' or 'O' : ");
		return scan.next().toUpperCase().charAt(0);

	}
	public static void main(String[] args) {
		System.out.println("Tic Tak Toe Boarder"+"\n");
		
		// creating object for create board
		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.showBoard();
		
		//Allow the player to choose 
		System.out.println("Enter the symbol X or O:");
		Scanner sc = new Scanner(System.in);
		char playerLetter = chooseInput(sc);
		char computerSymbol = (playerLetter == 'X') ? 'O' : 'X';
		System.out.println("Player Letter is : " + playerLetter);
		System.out.println("Computer Letter is : " + computerSymbol);

	}

}
