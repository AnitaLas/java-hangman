package pl.edu.agh.hangman;

public class MessagePrinter {

    protected void messageWelcome() {
        System.out.println();
        System.out.println("------------- NEW GAME -------------");
        System.out.println();
    }

    protected void messageGoodbye() {
        System.out.println();
        System.out.println("------------- See you soon! -------------");
    }

    protected void messageEnterSymbol() {
        System.out.print("enter symbol:   ");
    }

    protected void messageCurrentGuessedSymbolsOfPassword() {
        System.out.print("Current guessed symbols:   ");
    }

    protected void messageTryToGuessPassword() {
        System.out.print("password:   ");
    }

//    protected void questionGuessPassword() {
//        System.out.print("Do you want to guess the password? yes=1, no=press anything else:   ");
//    }

    protected void questionStartNewGame() {
        System.out.println();
        System.out.print("Do you want to play again? yes=1, no=press anything else:   ");
    }

    protected void messageForWinner() {
        System.out.println();
        System.out.print("You have won the game!    ");
    }

    public void messageChancesLeft(int countedChancesLeft) {
        System.out.print("Chances left:  " + countedChancesLeft + "\n");
    }

}
