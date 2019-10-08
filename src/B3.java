import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.TreeMap;

public class B3 {

    public static void main(String args[]) throws ParseException, IOException {
        HashMap hm = new HashMap();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);

        System.out.println(hm.get("two"));
        System.out.println(hm.get("four")); /*沒有找到key值會回傳null*/

        /*判斷是否存在key值*/
        if (hm.containsKey("four")) {
            System.out.println("No Key Existice");
        } else {
            System.out.println("Key Existice");
        }
    }
}