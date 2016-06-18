package com.thoughtworks.solo;

public class GameLooper {
    private TurnChooser turnChooser;
    private GameEnder gameEnder;

    public GameLooper(TurnChooser turnChooser, GameEnder gameEnder) {
        this.turnChooser = turnChooser;

        this.gameEnder = gameEnder;
    }

    public void startGameLoop(){
        turnChooser.playPlayerOneTurn();
        while (!gameEnder.isGameOver()) {
            turnChooser.playPlayerTwoTurn();
            turnChooser.playPlayerOneTurn();
        }
        gameEnder.endGame();

    }
}
