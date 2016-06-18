package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MoveReceiverTest {

    private Referee referee;
    private Board board;
    private MoveReceiver moveReceiver;
    private HumanPlayer player;

    @Before
    public void setUp() throws Exception {
        referee = mock(Referee.class);
        board = mock(Board.class);
        moveReceiver = new MoveReceiver(referee, board);
        player = new HumanPlayer(board, anyString());
    }

    @Test
    public void shouldPromptPlayerWhenEnforceValidMoveCalled() {
        when(board.isPositionAvailableOnBoard("1")).thenReturn(true);
        moveReceiver.enforceValidMove(player);
        verify(referee).promptPlayerForMove(player);
    }
    
    @Test
    public void shouldGetNewMoveWhenPositionInvalidAndGetValidMove() {
        when(board.isPositionAvailableOnBoard("1")).thenReturn(false, true);
        moveReceiver.enforceValidMove(player);
        verify(referee).illegalMoveGetNewOne();
    }
}