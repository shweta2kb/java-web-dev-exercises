package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length");
        int length = input.nextInt();
        System.out.println("Please enter Width of rectangle");
        int width = input.nextInt();
        System.out.println("Area of Rectangle " + length*width);
    }
}
