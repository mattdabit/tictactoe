package com.thoughtworks.solo;

import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TicTacToeManagerTest {


    private Board board;
    private TicTacToeManager ticTacToeManager;
    private Referee referee;
    private Player player1;


    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        referee = mock(Referee.class);
        player1 = mock(Player.class);
        ticTacToeManager = new TicTacToeManager(board, referee, player1, player1);

    }

    @Test
    public void shouldPlayOneTurnOfGameWhenStart() {
        ticTacToeManager.playOneTurnOfGame();
        verify(player1).isTurnOver();
    }


}