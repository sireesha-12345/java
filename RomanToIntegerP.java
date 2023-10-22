import java.util.*;

public class RomanToIntegerP {
    public static int romanToInt(String s) {
        // Create a HashMap to store Roman number characters and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;  // Initialize the result

        // Loop through the Roman numeral characters from left to right
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // Check if we need to subtract (e.g., IV or IX)
            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanMap.get(nextChar);
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent for entered Roman number is: " + integerEquivalent);
    }
}
