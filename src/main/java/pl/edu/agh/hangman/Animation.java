package pl.edu.agh.hangman;

import pl.edu.agh.hangman.animations.Hangman;
import pl.edu.agh.hangman.animations.Snowman;

public class Animation {

    private String[] animation;

    Animation() {
        this.animation = Snowman.SNOWMANPICS;
    }

    protected void setAnimation(String[] animation) {
        this.animation = animation;
    }

    protected void printNextElementForAnimation(int index) {
        System.out.println(this.animation[index]);
    }

    protected int getAnimationLength() {
        return this.animation.length;
    }

}
