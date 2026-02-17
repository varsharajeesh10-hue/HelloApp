public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Store all banner lines inside a String array
        String[] banner = {

            String.join("   ",
                    " *** ",
                    " *** ",
                    " ***** ",
                    " ***** "),

            String.join("   ",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**     "),

            String.join("   ",
                    "**   **",
                    "**   **",
                    "*****  ",
                    " ***   "),

            String.join("   ",
                    "**   **",
                    "**   **",
                    "**     ",
                    "    ** "),

            String.join("   ",
                    " *** ",
                    " *** ",
                    "**     ",
                    "*****  ")
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
