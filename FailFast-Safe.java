import java.util.*;

class Test{
    public static void main(String[] args){
        ArrayList<String> color = ArrayList<String>();

        color.add("Blue");
        color.add("Blue");
        color.add("Blue");
        color.add("Blue");
        color.add("Blue");
        color.add("Blue");
        color.add("Blue");
        color.add("Blue");

        Itrator<String> itr = color.ListIterator<String>();

        while(itr.HashNext()){
            System.out.println(itr.next());
        }
    }
}