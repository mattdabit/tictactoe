package com.thoughtworks.solo;

public class MoveReceiver {

    private Referee referee;
    private Board board;

    public MoveReceiver(Referee referee, Board board){
        this.referee = referee;
        this.board = board;
    }

    public String enforceValidMove(Player player){
        String playerMove = referee.promptPlayerForMove(player);
        while (!board.isPositionAvailableOnBoard(playerMove)){
            playerMove = referee.illegalMoveGetNewOne();
        }
        return playerMove;
    }
}
