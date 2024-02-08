import java.util.Scanner;
import java.util.Random;

public class Assignment_2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Random random = new Random ();
        boolean valid = false;
        int userInput = 0;

        System.out.println ("Please enter a positive integer for the size of the array:");

        //Checking for valid inputs for the size of the array
        do { 
            if (!in.hasNextInt ()) {
                System.out.println ("Invalid input, please enter a positive integer.");
            } else {
                userInput = in.nextInt ();

                if (userInput <= 0) {
                    System.out.println ("Invalid input, please enter a positive integer.");
                } else {
                    valid = true;
                }
            }
        } while (!valid);

        //Creating and displaying the array
        int [] randomizedArray = new int [userInput];

        for (int i = 0; i < userInput; i++) {
            randomizedArray [i] = random.nextInt (101);
        }

        System.out.println ("The array containing random integers at first: ");

        for (int i = 0; i < randomizedArray.length; i++) {
            System.out.print (randomizedArray[i] + " ");
        }

        System.out.println ();

    }

}
