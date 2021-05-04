package exercises;

import java.util.Scanner;
public class GasConsumed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of miles");
        int totalGallon = input.nextInt();
        System.out.println("Please enter amount of gas");
        int amountOfGas = input.nextInt();
        System.out.println("Total miles-per-gallon " + totalGallon/amountOfGas);
    }
}
