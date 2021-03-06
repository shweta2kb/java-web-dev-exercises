package org.launchcode.java.studios.CharCount;
class EachCharCount {
    static final int MAX_CHAR = 9000;
    static void getOccuringChar(String str)
    {
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
        int len = str.length();
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "
                                + str.charAt(i)
                                + " is:" + count[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there";
        getOccuringChar(str);
    }
}
