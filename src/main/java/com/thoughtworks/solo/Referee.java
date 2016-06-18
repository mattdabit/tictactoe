package com.thoughtworks.solo;



import java.io.PrintStream;

public class Referee {
    private PrintStream printStream;
    private Board board;
    private InputReader inputReader;


    public Referee(PrintStream printStream, Board board, InputReader inputReader){
        this.printStream = printStream;
        this.board = board;
        this.inputReader = inputReader;
    }

    public String promptPlayerForMove(Player player){
        printStream.println("Player using symbol "+ player.getSymbol() + " please enter the position you want to place your mark.");
        return inputReader.readLine();
    }


    public String illegalMoveGetNewOne() {
        printStream.println("Location already taken\nTry again");
        return inputReader.readLine();
    }

}
