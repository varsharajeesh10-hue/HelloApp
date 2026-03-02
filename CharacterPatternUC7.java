public class CharacterPatternUC7 {

    public static void main(String[] args) {

        // Create pattern for O (7 lines)
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "   ***   ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "   ***   "
        });

        // Pattern for P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        });

        // Pattern for S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  *****  ",
                " **   ** ",
                " **       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        });

        // Store O O P S
        CharacterPattern[] word = {O, O, P, S};

        // Print banner row by row (7 lines)
        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + "   ");
            }
            System.out.println();
        }
    }
}
