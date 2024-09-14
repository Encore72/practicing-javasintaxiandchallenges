public class Test {
   
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
        
        


    public static void main(String[] args) {
        
        System.out.println(rps("rock", "paper"));


    }

}
