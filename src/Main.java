import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        String trash = "";
        String continueYN = ""; // thee variables

        System.out.println("Let's play Rock, Paper, or Scissors!");
        System.out.println("Player 1, what's your move? [R, P, or S?]");
        Scanner in = new Scanner(System.in);
        do {
            trash = in.nextLine().toUpperCase();
            if (trash.equals("R") || trash.equals("P") || trash.equals("S")) {
                playerOne = in.nextLine();
                playerOne = playerOne.toUpperCase();
            } else {
                System.out.println("Oops! " + trash + " is not a valid input. Try R, P, or S!");
            }
        } while (!(playerOne.equals("R") || playerOne.equals("P") || playerOne.equals("S"))); // validate Player One's move
    }
}