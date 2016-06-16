package com.thoughtworks.solo;


import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HumanPlayerTest {

    @Test
    public void shouldMarkBoardWhenMoveIsValid() {
        BufferedReader bufferReader = mock(BufferedReader.class);
        Board board = mock(Board.class);
        HumanPlayer player = new HumanPlayer(bufferReader, board, "X");
        player.markBoard("1");
        verify(board).updateBoardPosition("1", "X");
    }


}