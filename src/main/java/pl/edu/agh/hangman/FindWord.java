package pl.edu.agh.hangman;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FindWord {

    private String word;

    FindWord(String fileName) throws IOException {
        this.word = takeRandomWord(fileName);
    }

    protected String getWord() {
        return this.word.toUpperCase();
    }

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

    protected String takeRandomWord(String fileName) throws IOException {
        ArrayList<String> word;
        try {
            word = getWordsList(fileName);
            int x;
            String wordToPlay;

            x = ThreadLocalRandom.current().nextInt(0, word.size());
            wordToPlay = word.get(x);
            return wordToPlay;
        } catch (RuntimeException ioe) {
            throw new RuntimeException(ioe);
        }
    }
}
