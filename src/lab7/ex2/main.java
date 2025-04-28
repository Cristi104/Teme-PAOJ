package lab7.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static String findLongestWord(String filename) throws IOException {
        String longestWord = "";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public static void appendClassContentToFile(String sourceClass, String targetFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceClass));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile, true));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }

    public static List<String> readFileIntoList(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public static void main(String[] args) {
        String fileName = "src/lab7/ex2/textfile.txt";
        try {
            String longestWord = findLongestWord(fileName);
            System.out.println("Cel mai lung cuvant: " + longestWord);

            appendClassContentToFile("src/lab7/ex2/main.java", fileName);
            List<String> lines = readFileIntoList(fileName);
            System.out.println("Continutul fisierului");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}