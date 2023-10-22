import java.util.Scanner;

public class PangramCheckerP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        boolean[] isPresent = new boolean[26]; // To track the presence of each letter (a-z)

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a'; // Calculate the index of the letter (0-25)
                isPresent[index] = true; // Mark the letter as present
            }
        }

        boolean isPangram = true; // Assume it's a pangram

        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                isPangram = false; // If any letter is missing, it's not a pangram
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
