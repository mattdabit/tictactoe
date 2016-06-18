package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameStarterTest {

    private Board board;
    private TurnChooser turnChooser;
    private PrintStream printStream;
    private GameStarter gameStarter;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        turnChooser = mock(TurnChooser.class);
        printStream = mock(PrintStream.class);
        gameStarter = new GameStarter(board);
    }

    @Test
    public void shouldDrawGameBoardWhenStarting() {
        gameStarter.startGame();
        when(board.isBoardFull()).thenReturn(false);
        verify(board).drawGameBoard();
    }



}