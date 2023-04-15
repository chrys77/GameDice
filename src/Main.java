import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random noRandom = new Random();

        int dice1 = 0;
        int dice2;
        int diceOp1;
        int diceOp2;

        int wins = 0;
        int defeats = 0;

        System.out.println("This is a dice game. You have to get 6 wins to win. Good luck!");

        while (true) {
            if (dice1 == 0) {
                System.out.println("Do you want to start a new dice game?");
            } else {
                System.out.println("Your wins: " + wins + "   Opponent Wins: " + defeats);
                System.out.println("Roll the dice again?");
            }
            String answer = sc.nextLine();
            System.out.println();

            if (answer.equalsIgnoreCase("y")) {
                //The game begins
                dice1 = noRandom.nextInt(6) + 1;
                dice2 = noRandom.nextInt(6) + 1;
                System.out.println("You rolled " + dice1 + " " + dice2);

                diceOp1 = noRandom.nextInt(6) + 1;
                diceOp2 = noRandom.nextInt(6) + 1;
                System.out.println("The opponent rolled " + diceOp1 + " " + diceOp2);

                if (dice1 + dice2 > diceOp1 + diceOp2) {
                    System.out.println("You won the round!");
                    wins++;
                } else if (dice1 + dice2 < diceOp1 + diceOp2) {
                    System.out.println("You lost the round!");
                    defeats++;
                } else {
                    System.out.println("Game draw!");
                }

                if (wins == 6) {
                    System.out.println("Bravo! You won the game!");
                    System.out.println("You had " + wins + " wins, and your opponent had " + defeats + " wins.\n");
                    dice1 = 0;
                    wins = 0;
                    defeats = 0;
                } else if (defeats == 6) {
                    System.out.println("I am sorry! You lost the game!");
                    System.out.println("You had " + wins + " wins, but your opponent had " + defeats + " wins.\n");
                    dice1 = 0;
                    wins = 0;
                    defeats = 0;
                }

            } else if (answer.equalsIgnoreCase("n")) {
                //Stop the game
                System.out.println("Ok! See you soon!");
                break;

            } else {
                System.out.println("I don't understand your answer.");
            }
        }
    }


}