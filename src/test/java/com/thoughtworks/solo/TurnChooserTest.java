package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TurnChooserTest {


    private Board board;
    private TurnChooser turnChooser;
    private Referee referee;
    private Player player1;
    private InputReader inputReader;
    private MoveReceiver moveReceiver;


    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        referee = mock(Referee.class);
        player1 = mock(Player.class);
        inputReader = mock(InputReader.class);
        moveReceiver = mock(MoveReceiver.class);
        turnChooser = new TurnChooser(board, player1, player1, moveReceiver);

    }
    @Test
    public void shouldPromptPlayerForMoveWhenStarting() {
        turnChooser.playPlayerOneTurn();
        verify(moveReceiver).enforceValidMove(player1);
    }

    @Test
    public void shouldMarkBoardOnceWhenPlayer1MakesMove() {
        turnChooser.playPlayerOneTurn();
        verify(player1).markBoard(anyString());
    }

    @Test
    public void shouldDrawBoardOnceWhenTurnStarts() {
        turnChooser.playPlayerOneTurn();
        verify(board).drawGameBoard();
    }

}