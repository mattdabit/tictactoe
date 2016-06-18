package com.thoughtworks.solo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        InputReader inputReader = new InputReader(new BufferedReader(new InputStreamReader(System.in)));
        Board board = new Board(printStream);
        Player player1 = new HumanPlayer(board, "X");
        Player player2 = new HumanPlayer(board, "O");
        Referee referee = new Referee(printStream, board, inputReader);
        MoveReceiver moveReceiver = new MoveReceiver(referee, board);
        TurnChooser turnChooser = new TurnChooser(board, player1, player2, moveReceiver);
        GameStarter gameStarter = new GameStarter(board);
        GameEnder gameEnder = new GameEnder(board, printStream);
        GameLooper gameLooper = new GameLooper(turnChooser, gameEnder);

        gameStarter.startGame();
        gameLooper.startGameLoop();
    }

}
