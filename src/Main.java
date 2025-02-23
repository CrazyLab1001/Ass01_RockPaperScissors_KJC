import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        String trash = "";
        String continueYN = "Y"; // thee variables
        do {
            System.out.println("Let's play Rock, Paper, or Scissors!");
            System.out.println("Player 1, what's your move? [R, P, or S?]");
            Scanner in = new Scanner(System.in);
            do {
                playerOne = in.nextLine();
                playerOne = playerOne.toUpperCase();
                if (playerOne.equals("R") || playerOne.equals("P") || playerOne.equals("S")) {
                    System.out.println("Valid input! Moving on to Player 2!");
                } else {
                    trash = playerOne;
                    System.out.println("Oops! " + trash + " is not a valid input. Try R, P, or S!");
                }
            } while (!(playerOne.equals("R") || playerOne.equals("P") || playerOne.equals("S"))); // validate Player One's move
            System.out.println("Player 2, what's your move? [R, P, or S?]");
            new Scanner(System.in);
            do {
                playerTwo = in.nextLine();
                playerTwo = playerTwo.toUpperCase();
                if (playerTwo.equals("R") || playerTwo.equals("P") || playerTwo.equals("S")) {
                    System.out.println("Valid input! Let's see the results!");
                } else {
                    trash = playerTwo;
                    System.out.println("Oops! " + trash + " is not a valid input. Try R, P, or S!");
                }
            } while (!(playerTwo.equals("R") || playerTwo.equals("P") || playerTwo.equals("S"))); // validate Player Two's move
            if (playerOne.equals("R")) {
                if (playerTwo.equals("R")) {
                    System.out.println("Just a couple of rocks! It's a tie!");
                } else if (playerTwo.equals("P")) {
                    System.out.println("Paper covers rock! Player 2 wins!");
                } else { // unnecessary to validate since we know Player 2 choose scissors
                    System.out.println("Rock breaks scissors! Player 1 wins!");
                }
            } else if (playerOne.equals("P")) {
                if (playerTwo.equals("R")) {
                    System.out.println("Paper covers rock! Player 1 wins!");
                } else if (playerTwo.equals("P")) {
                    System.out.println("It's just some paper! It's a tie!");
                } else { // unnecessary to validate since we know Player 2 choose scissors
                    System.out.println("Scissors cuts paper! Player 2 wins!");
                }
            } else {// unnecessary to validate since we know Player 1 choose scissor
                if (playerTwo.equals("R")) {
                    System.out.println("Rock breaks scissors! Player 2 wins!");
                } else if (playerTwo.equals("P")) {
                    System.out.println("Scissors cuts paper! Player 1 wins!");
                } else { // unnecessary to validate since we know Player 2 choose scissors
                    System.out.println("Two pairs of scissors! It's a tie!");
                }
            }
            System.out.println("Play again? (Y/N)");
            new Scanner(System.in);
            continueYN = in.nextLine();
            continueYN = continueYN.toUpperCase();
        } while (continueYN.equals("Y"));
    }
}