package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordChecker {

    private String staticSymbol = "_";
    private List<String> hiddenSymbols = new ArrayList<>();
    private List<String> discoverSymbols = new ArrayList<>();
    private FindWord findWord;
    private int maxCountedShots = 0;

    WordChecker(FindWord findWord) throws IOException {
        this.findWord = findWord;
        setDataSymbolsToDiscover();
    }

    private void setDataSymbolsToDiscover() {

        for (char c : this.findWord.getWord().toCharArray()) {
            if (Character.isLetter(c)) {
                this.hiddenSymbols.add(this.staticSymbol);

                if (!this.discoverSymbols.contains(String.valueOf(c))) {
                    this.maxCountedShots++;
                }
                this.discoverSymbols.add(String.valueOf(c));
            } else {
                this.hiddenSymbols.add(String.valueOf(c));
                this.discoverSymbols.add(String.valueOf(c));
            }
        }
    }

    protected int getMaxCountedShot() {
        return this.maxCountedShots;
    }

    protected void printCurrentGuessedSymbolsOfPassword() {
        for (String symbol : this.hiddenSymbols) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    protected boolean isSymbolExist(String symbolToCheck) {
        String currentSymbol = symbolToCheck.toUpperCase();

        if (this.findWord.getWord().contains(currentSymbol)) {

            for (int i = 0; i < this.discoverSymbols.size(); i++) {
                if (currentSymbol.equals(discoverSymbols.get(i))) {
                    this.hiddenSymbols.set(i, currentSymbol);
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
