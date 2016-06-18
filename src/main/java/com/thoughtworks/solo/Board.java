package com.thoughtworks.solo;

import java.io.PrintStream;

import java.util.Collection;
import java.util.HashSet;

public class Board {
    private PrintStream printStream;
    private Collection<String> allNumbersInBoard;
    private String board;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
        this.board = "1|2|3\n-----\n4|5|6\n-----\n7|8|9\n";
        this.allNumbersInBoard = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            allNumbersInBoard.add(i+"");
        }
    }

    public void drawGameBoard() {
        printStream.println(board);
    }

    public boolean isPositionAvailableOnBoard(String positionOnBoard) {
        return allNumbersInBoard.contains(positionOnBoard);
    }

    public boolean isBoardFull(){
        return allNumbersInBoard.isEmpty();
    }

    public void updateBoardPosition(String positionOnBoard, String currentPlayerSymbol) {
        board = board.replace(positionOnBoard, currentPlayerSymbol);
        allNumbersInBoard.remove(positionOnBoard);
    }


}
