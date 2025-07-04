package core.basesyntax;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWork {
    public String[] readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            int value = reader.read();
            while (value != -1) {
                builder.append((char) value);
                value = reader.read();
            }
            reader.close();

            String resultString = builder.toString();
            String[] words = resultString.split(" ");
            List<String> resultList = new ArrayList<>();
            for (String word: words) {
                if (word.startsWith("w") || word.startsWith("W")) {
                    resultList.add(word);
                }
            }
            return resultList.toArray(new String[0]);
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        }
    }
}
