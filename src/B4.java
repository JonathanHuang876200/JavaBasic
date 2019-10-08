import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class B4 {
    public static void main(String args[]) throws ParseException, IOException {
        HashMap testHashMap = new HashMap();
        testHashMap.put("one", 1);
        testHashMap.put("two", 2);
        testHashMap.put("three", 3);
        System.out.println(testHashMap); /*印出Map裡所有內容*/
//
        TreeMap testTreeMap = new TreeMap();
        testTreeMap.put("five", 5);
        testTreeMap.put("six", 6);
        testTreeMap.put("seven", 7);
        System.out.println(testTreeMap); /*印出Map裡所有內容*/
/*
        ArrayList a = new ArrayList();
        a.add("x");
        a.add("y");
        a.add("z");
        System.out.println(a);
        a.remove("y");
//        Boolean flag1 = a.contains("x");
//        System.out.println(flag1);
//        Boolean flag2 = a.isEmpty();
//        System.out.println(flag2);
//        a.clear();
//        System.out.println(a);

        a.set(0, "w");
        a.add(4,"y");
        System.out.println(a);
//        System.out.println(a.get(2));
//        System.out.println(a.subList(0,2));
        System.out.println(a.listIterator());
*/

        /*Set*/
        HashSet hs = new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("a"); /*因為a,c重複所以無法加入Set集合*/
        hs.add("c");
        System.out.println(hs);     /*印出時沒有順序*/

    }
}