package pl.edu.agh.hangman;

import java.io.IOException;

public class Game {

    private LineReader lineReader;
    private FindWord findWord;
    private WordChecker wordChecker;
    private Animation animation;
    private MessagePrinter printer = new MessagePrinter();

    Game() throws IOException {
        this.lineReader = new LineReader();
        this.findWord = new FindWord("slowa.txt");
        this.wordChecker = new WordChecker(findWord);
        this.animation = new Animation();
    }

//    protected void setFindWord(FindWord findWord) {
//        this.findWord = findWord;
//    }

    protected void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public void playOneGame() throws IOException {

        int maxNumberCorrectShots = this.wordChecker.getMaxCountedShot();
        int countedCorrectShots = 0;
        int maxAnimationNumber = this.animation.getAnimationLength();
        int countedWrongShots = 0;
        int countedChancesLeft = maxAnimationNumber;

        do {
            this.printer.messageCurrentGuessedSymbolsOfPassword();
            this.wordChecker.printCurrentGuessedSymbolsOfPassword();
            this.printer.messageEnterSymbol();
            this.lineReader.setLine();
            boolean symbolExist = this.wordChecker.isSymbolExist(this.lineReader.getLine());

            if (symbolExist) {
                countedCorrectShots++;
                if (countedCorrectShots == maxNumberCorrectShots) {
                    this.printer.messageForWinner();
                    this.wordChecker.printCurrentGuessedSymbolsOfPassword();
                }

            } else {
                animation.printNextElementForAnimation(countedWrongShots);
                countedWrongShots++;
                countedChancesLeft--;
                if (countedChancesLeft > 0)
                    this.printer.messageChancesLeft(countedChancesLeft);
            }
        }
        while ((countedCorrectShots < maxNumberCorrectShots && countedWrongShots < maxAnimationNumber)); //{
    }

}
