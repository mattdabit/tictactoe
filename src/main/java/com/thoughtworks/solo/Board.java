package com.thoughtworks.solo;

import java.io.PrintStream;

import java.util.HashSet;
import java.util.Set;

public class Board {
    private PrintStream printStream;
    private String board;
    private Set<String> allNumbersInBoard;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
        this.board = "1|2|3\n-----\n4|5|6\n-----\n7|8|9\n";
        this.allNumbersInBoard = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            allNumbersInBoard.add(i + "");
        }
    }

    public void drawGameBoard() {
        printStream.println(board);
    }

    public boolean isPositionAvailableOnBoard(String positionOnBoard) {
        if(allNumbersInBoard.contains(positionOnBoard)){
            return true;
        }else{

            return false;
        }

    }

    public boolean isBoardFull(){
        return allNumbersInBoard.isEmpty();
    }

    public void updateBoardPosition(String positionOnBoard, String currentPlayerSymbol) {
        int indexOfPositionOnBoard = board.indexOf(positionOnBoard);
        board = board.substring(0, indexOfPositionOnBoard) + currentPlayerSymbol + board.substring(indexOfPositionOnBoard+1);
        allNumbersInBoard.remove(positionOnBoard);
    }
}
