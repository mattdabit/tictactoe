package com.thoughtworks.solo;

public class GameStarter {

    private final Board board;

    public GameStarter(Board board) {
        this.board = board;
    }

    public void startGame() {
        board.drawGameBoard();
    }

}
