package com.Bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	final static int HEAD = 0;
	final static int TAIL = 1;
	public static Scanner sc = new Scanner(System.in);
	public static char playerChoice;
	static char board[] = new char[10];

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

		char choice = sc.next().charAt(0);

		char computerChoice;
		if (choice == 'X' || choice == 'x') {
			playerChoice = choice;
			computerChoice = 'O';
			System.out.println("Your choose  " + playerChoice);
			System.out.println("Computer choose " + computerChoice);
		} else if (choice == 'O' || choice == 'o') {
			playerChoice = choice;
			computerChoice = 'X';
			System.out.println("Your choose " + playerChoice);
			System.out.println("Computer choose " + computerChoice);
		} else
			System.out.println("invalid char");
		return 0;
	}

	public void playerMakeMove(char playerLetter) {
		boolean isPositionFree;
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
		} while (!isPositionFree);
		board[boardLocation] = playerLetter;
		showBoard();

	}

	// Check position
	public boolean checkIfPositionFree(int boardLocation) {
		if (board[boardLocation] == ' ') {
			return true;
		} else {
			System.out.println("Already filled");
			return false;
		}
	}

	public void checkWhoPlaysFirst() {
		int toss = (int) (Math.random() * 10) % 2;
		if (toss == HEAD) {
			System.out.println("Player play first");
		} else if (toss == TAIL) {
			System.out.println("Computer play first");
		}

	}
	public boolean getWinner(char playerSymbol) {
		if ((board[1] == playerSymbol && board[2] == playerSymbol && board[3] == playerSymbol)
				|| (board[4] == playerSymbol && board[5] == playerSymbol && board[6] == playerSymbol)
				|| (board[7] == playerSymbol && board[8] == playerSymbol && board[9] == playerSymbol)
				|| (board[1] == playerSymbol && board[5] == playerSymbol && board[9] == playerSymbol)
				|| (board[3] == playerSymbol && board[5] == playerSymbol && board[7] == playerSymbol)
				|| (board[1] == playerSymbol && board[4] == playerSymbol && board[7] == playerSymbol)
				|| (board[2] == playerSymbol && board[5] == playerSymbol && board[8] == playerSymbol)
				|| (board[3] == playerSymbol && board[6] == playerSymbol && board[9] == playerSymbol)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// creating object
		TicTacToeGame tictactoe = new TicTacToeGame();
		boolean winner = tictactoe.getWinner(playerChoice);

	}

}
