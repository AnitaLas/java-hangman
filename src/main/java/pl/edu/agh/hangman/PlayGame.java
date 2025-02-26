package pl.edu.agh.hangman;

import java.io.IOException;

public class PlayGame {

    private MessagePrinter printer = new MessagePrinter();
    private LineReader lineReader = new LineReader();
    private Animation animation;

    PlayGame() throws IOException {
        this.animation = new Animation();
    }

    protected void setAnimation(Animation animation) {
        this.animation = animation;
    }

    protected void playGameManyTimes() throws IOException {

        Game game;
        do {
            this.printer.messageWelcome();

            game = new Game();
            game.setAnimation(this.animation);
            game.playOneGame();

            this.printer.questionStartNewGame();
            this.lineReader.setLine();

        } while ((this.lineReader.getLine()).equals("1"));

        this.printer.messageGoodbye();
    }

}
