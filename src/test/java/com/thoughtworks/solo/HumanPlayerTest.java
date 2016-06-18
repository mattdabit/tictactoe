package com.thoughtworks.solo;


import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HumanPlayerTest {

    @Test
    public void shouldMarkBoardWhenMoveIsValid() {
        Board board = mock(Board.class);
        HumanPlayer player = new HumanPlayer(board, "X");
        player.markBoard("1");
        verify(board).updateBoardPosition("1", "X");
    }


}