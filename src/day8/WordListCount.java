package src.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by vsanghav on 8/15/2016.
 */
public class WordListCount {

    public static void main(String[] args) throws IOException {


        FileReader in = new FileReader("data/prideandprejudice.txt");
        BufferedReader br = new BufferedReader(in);
        String line;

        Map<String,Integer> allWords = new HashMap<String,Integer>();

        while((line = br.readLine()) != null){
            String[] wordList = line.split(" +");
            for(String w : wordList){
                if(allWords.containsKey(w.toLowerCase()))
                    allWords.put(w.toLowerCase(), allWords.get(w.toLowerCase())+1);
                else
                    allWords.put(w.toLowerCase(), 1);
            }
        }

        for (Map.Entry<String, Integer> entry : allWords.entrySet())
        {
            System.out.println("Word " + entry.getKey() + " occurs " + entry.getValue() + " times ");
        }

        in.close();


    }
}
