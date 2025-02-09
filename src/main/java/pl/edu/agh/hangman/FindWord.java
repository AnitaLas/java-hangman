package pl.edu.agh.hangman;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FindWord {

    public ArrayList<String> getWordsList() throws IOException {
        InputStream wordsFile = getClass().getClassLoader().getResourceAsStream("slowa.txt");
        InputStreamReader streamReader = new InputStreamReader(wordsFile, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        ArrayList<String> wordsList = new ArrayList();
        String word;
        while ((word = reader.readLine()) != null) {
            wordsList.add(word);
        }
        return wordsList;
    }

    public void takeRandomWord() throws IOException {
        ArrayList<String> wordsList;
        wordsList = getWordsList();

        int x = ThreadLocalRandom.current().nextInt(0, wordsList.size());
        System.out.println(wordsList.get(x));
    }

}
