package collectionC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
       // System.out.println(list);
        ArrayList<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("two");
        list1.add("c");
        list.retainAll(list1);
        System.out.println(list);

    }
}
