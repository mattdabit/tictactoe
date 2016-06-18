package com.thoughtworks.solo;


public class HumanPlayer implements Player {
    private Board board;
    private String symbol;

    public HumanPlayer(Board board, String symbol){
        this.board = board;
        this.symbol = symbol;
    }


    @Override
    public void markBoard(String move) {
        board.updateBoardPosition(move, symbol);
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }


}
