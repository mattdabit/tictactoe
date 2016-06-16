package com.thoughtworks.solo;

public interface Player {
    String chooseMove();
    boolean isTurnOver();
    void markBoard(String move);
    String getSymbol();
}
