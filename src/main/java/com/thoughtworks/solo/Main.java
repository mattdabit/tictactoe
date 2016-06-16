package com.thoughtworks.solo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);
        Player player1 = new HumanPlayer(bufferedReader, board, "X");
        Player player2 = new HumanPlayer(bufferedReader, board, "O");
        Referee referee = new Referee(printStream, board);
        TicTacToeManager ticTacToeManager = new TicTacToeManager(board, referee, player1, player2);
        board.drawGameBoard();
        while (!board.isBoardFull()) {
            ticTacToeManager.playOneTurnOfGame();
            board.drawGameBoard();
            ticTacToeManager.switchPlayerTurn();
        }

    }
}
