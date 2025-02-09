package pl.edu.agh.hangman;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        PlayerBoard playerBoard = new PlayerBoard();
//        playerBoard.giveMeLetter();
        FindWord findWord = new FindWord();
        findWord.takeRandomWord("slowa.txt");
        Word word = new Word();
        word.setEmptyWord();
    }
}
