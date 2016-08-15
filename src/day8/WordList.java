package src.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vsanghav on 8/15/2016.
 */
public class WordList {

    public static void main(String[] args) throws IOException {


        FileReader in = new FileReader("data/prideandprejudice.txt");
        BufferedReader br = new BufferedReader(in);
        String line;

        Set<String> allWords = new HashSet<String>();

        while((line = br.readLine()) != null){
            String[] wordList = line.split("\\W+");
            for(String w : wordList){
                allWords.add(w.toLowerCase());
            }
        }

        allWords.forEach(System.out::println);

        in.close();


    }
}
