package exercises;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String phrase="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
       // String str1=str.split(".");
        String[] str1 = phrase.split(",");
        for (String a : str1){
            System.out.println(a);
    }
        System.out.println(Arrays.toString(str1));
    }
}
