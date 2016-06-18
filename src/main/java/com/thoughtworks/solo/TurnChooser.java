package com.thoughtworks.solo;


public class TurnChooser {
    private Board board;
    private Player player1;
    private Player player2;
    private MoveReceiver moveReceiver;


    public TurnChooser(Board board, Player player1, Player player2, MoveReceiver moveReceiver) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.moveReceiver = moveReceiver;
    }
    

    public void playPlayerOneTurn(){
        String player1Move = moveReceiver.enforceValidMove(player1);
        player1.markBoard(player1Move);
        board.drawGameBoard();

    }

    public void playPlayerTwoTurn(){
        String player2Move = moveReceiver.enforceValidMove(player2);
        player2.markBoard(player2Move);
        board.drawGameBoard();
    }


}
