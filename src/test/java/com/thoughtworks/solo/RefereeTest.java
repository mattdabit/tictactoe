package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class RefereeTest {

    private Board board;
    private Referee referee;
    private PrintStream printStream;
    private HumanPlayer player1;
    private InputReader inputReader;


    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        inputReader = mock(InputReader.class);
        player1 = new HumanPlayer(board, "X");
        referee = new Referee(printStream, board, inputReader);

    }

    @Test
    public void shouldPromptPlayerForInputWhenGameStarts() {
        referee.promptPlayerForMove(player1);
        verify(printStream).println(contains("please enter the position you want to place your mark."));
    }

    @Test
    public void shouldPromptPlayerThatIllegalMoveWasMade() {
        referee.illegalMoveGetNewOne();
        verify(printStream).println("Location already taken\nTry again");
    }


}