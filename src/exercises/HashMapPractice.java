package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        System.out.println("In Hash Map Class");
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer newID;
        System.out.println("Enter your students (or ENTER to finish):");
        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newID = input.nextInt();

            if (!newID.equals("")) {
                System.out.print("Name: ");
                String student = input.nextLine();
                students.put(newID,student);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}
