package com.thoughtworks.solo;



import java.io.PrintStream;

public class Referee {
    private PrintStream printStream;
    private Board board;


    public Referee(PrintStream printStream, Board board){
        this.printStream = printStream;
        this.board = board;


    }

    public void promptAndEvaluatePlayerMove(Player playerCurrentlyChoosingMove) {
        printStream.println("Player using symbol "+ playerCurrentlyChoosingMove.getSymbol() + " please enter the position you want to place your mark.");

        String playerInput = playerCurrentlyChoosingMove.chooseMove();
        boolean isInputValid = board.isPositionAvailableOnBoard(playerInput);
        if (!isInputValid){
            promptUserThatLocationIsTaken();
            playerInput = playerCurrentlyChoosingMove.chooseMove();
        }
        playerCurrentlyChoosingMove.markBoard(playerInput);
    }


    public void promptUserThatLocationIsTaken() {
        printStream.println("Location already taken");
        printStream.println("Please Try Again");
    }

}
