package exercises;

public class stringSearch {
    public static void main(String[] args) {
        String  AliceAdventures="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        boolean isFound = AliceAdventures.indexOf("Alice") !=-1? true: false;
        System.out.println(isFound);
    }
}
