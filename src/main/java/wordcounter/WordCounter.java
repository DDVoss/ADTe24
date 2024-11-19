package wordcounter;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class WordCounter
{
    String data = "";
    public WordCounter(String data, boolean isFile)
    {
        if (isFile)
        {
            // Read the file and store the data in the data variable
            try
            {
                Scanner scanner = new Scanner(new File(data));
                while (scanner.hasNextLine())
                {
                    this.data += scanner.nextLine();
                }

            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            // Store the data in the data variable
            this.data = data;
        }
    }

    public int countTotalWords()
    {
        int counter = 0;
        this.data.replaceAll("\s", "\\w");
        String[] arrPirate = data.split(" ");
        for (String word : arrPirate){
            if (word.matches("\\w+")){
                counter++;
            }
        }
        return counter;
    }

    public Map<String, Integer> countWordOccurrences()
    {
        Map<String, Integer> map = new HashMap<String, Integer>();



        return map;
    }
}
