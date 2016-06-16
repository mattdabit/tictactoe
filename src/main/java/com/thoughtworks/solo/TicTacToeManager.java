package com.thoughtworks.solo;


public class TicTacToeManager {
    private Player currentPlayerMakingMove;
    private Board board;
    private Referee referee;
    private Player player1;
    private Player player2;


    public TicTacToeManager(Board board, Referee referee, Player player1, Player player2) {
        this.board = board;
        this.referee = referee;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayerMakingMove = player1;
    }




    public void playOneTurnOfGame(){
        referee.promptAndEvaluatePlayerMove(currentPlayerMakingMove);
        currentPlayerMakingMove.isTurnOver();
    }

    public void switchPlayerTurn(){
        if (currentPlayerMakingMove.equals(player1)){
            currentPlayerMakingMove = player2;
        } else {
            currentPlayerMakingMove = player1;
        }
    }


}
