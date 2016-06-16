package com.thoughtworks.solo;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawEmptyGameBoardWhenStarting() {
        board.drawGameBoard();
        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldReturnTrueWhenPlayerInputIsAvailableOnBoard() {
        assertTrue(board.isPositionAvailableOnBoard("1"));
    }

    @Test
    public void shouldReturnFalseWhenPlayerInputIsBad() {
        assertFalse(board.isPositionAvailableOnBoard("-"));
    }

    @Test
    public void shouldUpdateBoardWithOneSlotAsXWhenUpdateBoardMethodIsCalledWithOne() {
        board.updateBoardPosition("1", "X");
        board.drawGameBoard();
        verify(printStream).println("X|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

}