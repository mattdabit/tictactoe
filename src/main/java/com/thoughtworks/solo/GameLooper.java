package com.thoughtworks.solo;

public class GameLooper {
    private TurnChooser turnChooser;
    private GameEnder gameEnder;

    public GameLooper(TurnChooser turnChooser, GameEnder gameEnder) {
        this.turnChooser = turnChooser;

        this.gameEnder = gameEnder;
    }

    public void startGameLoop(){
        while (!gameEnder.isGameOver()) {
            turnChooser.playPlayerOneTurn();
            if (gameEnder.isGameOver()){
                break;
            }
            turnChooser.playPlayerTwoTurn();
        }
        gameEnder.endGame();

    }
}
