package collectionC;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Set<String> set1= new HashSet<>();
        set1.add("1");
        set1.add("2");
        System.out.println(set.removeAll(set1));
        System.out.println(set);

        for (String s:set) {
            System.out.println(s);
        }

    }
}
