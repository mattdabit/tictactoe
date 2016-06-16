package com.thoughtworks.solo;
import java.io.BufferedReader;
import java.io.IOException;

public class HumanPlayer implements Player {
    private BufferedReader bufferReader;
    private Board board;
    private String symbol;

    public HumanPlayer(BufferedReader bufferReader, Board board, String symbol){
        this.bufferReader = bufferReader;
        this.board = board;
        this.symbol = symbol;
    }

    @Override
    public String chooseMove(){
        return readLine();
    }

    @Override
    public boolean isTurnOver() {
        return true;
    }

    @Override
    public void markBoard(String move) {
        board.updateBoardPosition(move, symbol);
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    public String readLine() {
        try {
            return bufferReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
