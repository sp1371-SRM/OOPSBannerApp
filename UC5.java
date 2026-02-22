public class UC5 {
    public static void main(String[] args) {
        // UC5: Inline Array Initialization using String.join()
        // This combines declaration, initialization, and population in one statement.
        String[] banner = {
            String.join("  ", " *** ", " *** ", " *** ", " ****", " * "), // Line 1
            String.join("  ", "* *", "* *", "* *", "* *", "* "), // Line 2
            String.join("  ", "* *", "* *", "* *", "* *", "* "), // Line 3
            String.join("  ", "* *", "* *", "* *", "**** ", " *** "), // Line 4
            String.join("  ", "* *", "* *", "* *", "* ", "    *"), // Line 5
            String.join("  ", "* *", "* *", "* *", "* ", "    *"), // Line 6
            String.join("  ", " *** ", " *** ", " *** ", "* ", " *** ")  // Line 7
        };

        // Using Enhanced For Loop (for-each) for clean output as per UC5 requirements
        for (String line : banner) {
            System.out.println(line);
        }
    }
}