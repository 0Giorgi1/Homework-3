import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/georg/IdeaProjects/Converter/src/input.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/georg/IdeaProjects/Converter/src/output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder convertedLine = new StringBuilder();
                for (char ch : line.toCharArray()) {
                    String convertedChar = GeorgianLatinMapping.georgianToLatin(ch);
                    if (convertedChar != null) {
                        convertedLine.append(convertedChar);
                    } else {
                        convertedLine.append(ch);
                    }
                }
                System.out.println(convertedLine);
                writer.println(convertedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}