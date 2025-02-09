package pl.edu.agh.hangman;

import java.util.ArrayList;

public class Word {

    private String word;
    private String staticSymbol = "_";
    private String[] symbolsToCheck;
    private ArrayList<String>  wordToCheck;


    Word(ArrayList<String> wordToCheck) {
        this.word = word;
        this.symbolsToCheck = new String[word.length()];

        for(int i = 0; i < symbolsToCheck.length; i++) {
            this.symbolsToCheck[i] = staticSymbol;
        }
    }


    public void printWord(){
        for(String symbol : this.symbolsToCheck) {
            System.out.print(symbol);
            //System.out.println();
        }
        System.out.println();
    }

    public boolean isSymbolExist(String newSymbol){

        for(int i = 0; i < symbolsToCheck.length; i++) {

            if(this.wordToCheck.get(i).equals(newSymbol)) {
                System.out.println ("1 " +symbolsToCheck[i]);
                this.symbolsToCheck[i] = newSymbol;
                return true;
            }
            else {
                System.out.println ("2 " +symbolsToCheck[i]);
                return false;
            }
        }

        return false;

    }





}
