package com.thoughtworks.solo;

import java.io.PrintStream;

public class GameEnder {
    private final Board board;
    private final PrintStream printStream;

    public GameEnder(Board board, PrintStream printStream) {

        this.board = board;
        this.printStream = printStream;
    }

    public void endGame(){
        printStream.println("Game is a Draw");
    }

    public boolean isGameOver() {
        return board.isBoardFull();
    }
}
