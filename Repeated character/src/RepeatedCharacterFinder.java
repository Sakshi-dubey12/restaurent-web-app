import java.util.HashSet;

public class RepeatedCharacterFinder {

    public static Character findFirstRepeatedCharacter(String str) {
        HashSet<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (seenCharacters.contains(currentChar)) {
                return currentChar;
            }
            seenCharacters.add(currentChar);
        }

        return null; // No repeated character found
    }

    public static void main(String[] args) {
        String input = "Ananaya";
        Character result = findFirstRepeatedCharacter(input);

        if (result != null) {
            System.out.println("First repeated character: " + result);
        } else {
            System.out.println("No repeated character found.");
        }
    }
}
