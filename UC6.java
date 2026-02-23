/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods.
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "** ** ",
            "** ** ",
            "****** ",
            "** ",
            "** ",
            "** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "** ",
            "** ",
            " *** ",
            "    ** ",
            "    ** ",
            "***** "
        };
    }

    public static void main(String[] args) {
        // Declare String Arrays to hold patterns from helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a loop to assemble and print each line of the banner
        // Note: oPattern is called twice to achieve the "OOPS" visual effect
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}