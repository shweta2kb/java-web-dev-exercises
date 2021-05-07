package org.launchcode.java;

public class ArrayPractice {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 3, 5, 8};
        for (int i = 0; i < arr.length; i++)
            if(arr[i]%2==1) {
                System.out.println("Element at index " + i +
                        " : " + arr[i]);
            }
    }
}
