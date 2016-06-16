package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RefereeTest {

    private Board board;
    private Referee referee;
    private PrintStream printStream;
    private Player player1;


    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        player1 = mock(Player.class);
        referee = new Referee(printStream, board );

    }

    @Test
    public void shouldPromptPlayerForInputWhenGameStarts() {
        referee.promptAndEvaluatePlayerMove(player1);
        verify(printStream).println(contains("please enter the position you want to place your mark."));
    }

    @Test
    public void shouldPromptPlayerIfLocationTaken() throws IOException {
        when(player1.chooseMove()).thenReturn("1", "1");
        referee.promptAndEvaluatePlayerMove(player1);
        verify(printStream).println(contains("Location already taken"));
    }
}