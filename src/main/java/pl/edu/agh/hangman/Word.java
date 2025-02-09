package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;

public class Word {

    private String word;
    private String staticSymbol = "_";
    private String[] symbolsToCheck;
    private char[] wordToCheck;


    Word() throws IOException {
        FindWord findWord = new FindWord();

        //this.symbolsToCheck = new String[findWord.takeRandomWord("slowa.txt").length()];
        this.wordToCheck = findWord.takeRandomWord("slowa.txt").toCharArray();
        this.symbolsToCheck = new String[this.wordToCheck.length];

        for(int i = 0; i < this.wordToCheck.length; i++) {
            this.symbolsToCheck[i] = staticSymbol;
        }
    }


    public void printWord(){
        for(String symbol : this.symbolsToCheck) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public boolean isSymbolExist(String newSymbol){

        for(int i = 0; i < this.wordToCheck.length; i++) {

            String c1 = Character.toString(this.wordToCheck[i]);
            System.out.print(c1);

            if(newSymbol.equals(c1)) {

                System.out.print(c1);
                this.symbolsToCheck[i] = newSymbol;
                return true;
            }
            else {

                return false;
            }
        }

        return false;

    }





}
