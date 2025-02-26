package pl.edu.agh.hangman;

import pl.edu.agh.hangman.animations.Hangman;
import pl.edu.agh.hangman.animations.Snowman;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Animation animation = new Animation();
        animation.setAnimation(Hangman.HANGMANPICS);

        PlayGame playGame = new PlayGame();
        //playGame.setAnimation(animation);
        playGame.playGameManyTimes();

    }
}
