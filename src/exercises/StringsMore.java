package exercises;
import java.util.Scanner;
public class StringsMore {
    public static void main(String[] args) {
        String  AliceAdventures="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Find the String");
        String isFoundSting = input.nextLine();
        System.out.println("Hello " + isFoundSting);
        boolean isFound = AliceAdventures.indexOf(isFoundSting) !=-1? true: false;
        System.out.println("Found String " + isFound);


    }
}
