public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))) {
            return "Player  won!";
        } else if ((p1.equals("scissors") && p2.equals("rock")) ||
                (p1.equals("paper") && p2.equals("scissors")) ||
                (p1.equals("rock") && p2.equals("paper"))) {
            return "Player 2 won!";
        } else if ((p1.equals("rock") && p2.equals("rock")) ||
                (p1.equals("scissors") && p2.equals("scissors")) ||
                (p1.equals("paper") && p2.equals("paper"))) {
            return "Draw!";
        } else {
            return null;
        }

    }

    // version pro

    public static String rps2(String p1, String p2) {
        if (p1 == p2) {
            return "Draw!";
        }
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
            return "Player " + p + " won!";

    }

    
    public static void main(String[] args) {

        System.out.println(rps("rock", "paper"));

    }

}
