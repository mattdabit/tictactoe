package com.thoughtworks.solo;

import java.io.BufferedReader;
import java.io.IOException;

public class InputReader {
    private BufferedReader bufferedReader;

    public InputReader(BufferedReader bufferedReader){
        this.bufferedReader = bufferedReader;
    }
    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
