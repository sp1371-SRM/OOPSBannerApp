/**
 * UC4 - OOPS Banner Application
 * Uses a String Array and a for-each loop to print the banner.
 */
public class UC4 {
    public static void main(String[] args) {
        
        // 1. Create a String array to store all seven lines of the banner [cite: 21]
        String[] banner = new String[7];

        // 2. Populate the array using String.join() [cite: 22]
        banner[0] = String.join("   ", " *** ", " *** ", "******", " *****");
        banner[1] = String.join("   ", "** **", "** **", "** **", "** ");
        banner[2] = String.join("   ", "** **", "** **", "** **", "** ");
        banner[3] = String.join("   ", "** **", "** **", "******", " *****");
        banner[4] = String.join("   ", "** **", "** **", "**", "     **");
        banner[5] = String.join("   ", "** **", "** **", "**", "** **");
        banner[6] = String.join("   ", " *** ", " *** ", "**", " *****");

        // 3. Use a for-each loop to iterate and print [cite: 23]
        for (String line : banner) {
            System.out.println(line);
        }
    }
}