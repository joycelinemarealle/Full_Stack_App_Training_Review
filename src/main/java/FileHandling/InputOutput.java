package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class InputOutput {
    public static void main (String [] args){
        String path = "/Users/joycelinemarealle/Desktop/peopleshores";

        int wordCount = wordCount(path);
        System.out.println(wordCount);

        Map <String, Integer> wordFrequency = wordFrequency(path);
        System.out.println(wordFrequency);

    }

    public static int wordCount (String path){
        //go throughh every line
        // break the sentence in a line by space to get words
        //add this words in array
        //check length of array
        int wordTotal =0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line;
            while ( (line = br.readLine()) != null){
                String [] words = line.split(" ") ;
                 wordTotal += words.length;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return wordTotal;
    }

    public static Map<String , Integer> wordFrequency (String path){
        Map < String , Integer> frequency = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line;
            int halfCount = 0;

            while ( (line = br.readLine()) != null){
                String [] words = line.split(" ");

                for ( String word: words){
                    if ("half". equalsIgnoreCase(word)){
                        halfCount++;
                        frequency.put(word, halfCount);
                        //frequency.put(word, frequency.getOrDefault(word,0) +1)
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();

        }
        return frequency;
    }
}
