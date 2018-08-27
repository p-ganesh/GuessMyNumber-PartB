import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int actualNumber =  1 + (int)(Math.random() * 99.0D);
        int guessedNumber = 0;
        int numberofguesses = 0;

        while (guessedNumber != actualNumber) {
                System.out.println("Pick a number between 1 and 100.");
            guessedNumber = keyboard.nextInt();

            if (guessedNumber > actualNumber) {
                System.out.println("No the number is lower.");
                ++numberofguesses;
            }
            else {
                System.out.println("No, the number is higher.");
                ++numberofguesses;
            }
            }
            System.out.println("You finally found it!");


        }
}
