import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    // 1. Define a Map to store the character patterns (The "Database")
    private static Map<Character, String[]> letterMap = new HashMap<>();

    // 2. Initialize the patterns using a function (Modularity)
    public static void initPatterns() {
        letterMap.put('O', new String[]{
            " *** ",
            "* *",
            "* *",
            "* *",
            " *** "
        });

        letterMap.put('P', new String[]{
            "**** ",
            "* *",
            "**** ",
            "* ",
            "* "
        });

        letterMap.put('S', new String[]{
            " ****",
            "* ",
            " *** ",
            "    *",
            "**** "
        });
    }

    // 3. A function to display a specific letter pattern
    public static void printLetter(char c) {
        if (letterMap.containsKey(c)) {
            String[] pattern = letterMap.get(c);
            for (String line : pattern) {
                System.out.println(line);
            }
            System.out.println(); // Space between letters
        } else {
            System.out.println("Pattern for " + c + " not available.");
        }
    }

    // 4. Main function to drive the application
    public static void main(String[] args) {
        // Initialize the data
        initPatterns();

        // The word to display
        String word = "OOPS";

        System.out.println("Displaying Banner for: " + word + "\n");

        // Loop through the string and print each character
        for (char c : word.toCharArray()) {
            printLetter(c);
        }
    }
}