package com.thoughtworks.solo;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameLooperTest {
    private GameEnder gameEnder;
    private TurnChooser turnChooser;
    private GameLooper gameLooper;

    @Before
    public void setUp() throws Exception {
        turnChooser = mock(TurnChooser.class);
        gameEnder = mock(GameEnder.class);
        gameLooper = new GameLooper(turnChooser, gameEnder);
    }

    @Test
    public void shouldEndLoopWhenBoardIsFull() {
        when(gameEnder.isGameOver()).thenReturn(true);
        gameLooper.startGameLoop();
        verify(gameEnder).endGame();
    }



}