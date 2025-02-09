package pl.edu.agh.hangman;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FindWord {


    private ArrayList<String> getWordsList(String fileName) throws IOException {
        InputStream wordsFile = getClass().getClassLoader().getResourceAsStream(fileName);
        InputStreamReader streamReader = new InputStreamReader(wordsFile, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        ArrayList<String> wordsList = new ArrayList();
        String word;
        while ((word = reader.readLine()) != null) {
            wordsList.add(word);
        }
        return wordsList;
    }

    public String takeRandomWord(String fileName) throws IOException {
        ArrayList<String> word;
        word = getWordsList(fileName);
        int x;
        String wordToPlay;

        x = ThreadLocalRandom.current().nextInt(0, word.size());
        wordToPlay = word.get(x);


        System.out.println(wordToPlay);

        return wordToPlay;
    }

}
