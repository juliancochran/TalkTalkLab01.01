import java.util.Scanner;

/**
 * Simple I/O project using Scanner.
 * @version 09.22.2022
 * @author jcochran
 */
public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args) {
        // declaring local variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);

        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");

        // getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();

        // summary of user input
        System.out.println("Here is how you print \"quotation marks\"");

        //System.out.println(movie + " is terrible! I hate that.");
        //System.out.println("JK!!! I love " + movie + " too.");
    }
}
