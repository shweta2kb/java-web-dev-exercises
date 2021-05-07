package exercises;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrString=new ArrayList<>();
        arrString.add("Shweta");
        arrString.add("Suman");
        arrString.add("Sarthak");
        arrString.add("Samika");
        arrString.add("Aaaaa");
        arrString.add("bbbbb");
        arrString.add("cccc");
        for(String str:arrString){
            System.out.printf(str);
        }
        //System.out.println(arrString);
       //System.out.println(Find5WordLetter(arrString));
    }

}
