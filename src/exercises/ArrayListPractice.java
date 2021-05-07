package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumber=new ArrayList<>();
        arrNumber.add(1);
        arrNumber.add(6);
        arrNumber.add(4);
        arrNumber.add(3);
        arrNumber.add(8);
        arrNumber.add(4);
        System.out.println(arrNumber);
        System.out.println(sumEven(arrNumber));
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
