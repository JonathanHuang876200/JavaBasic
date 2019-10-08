import java.io.IOException;
import java.text.ParseException;

public class B1 {
    public static void main(String args[]) throws ParseException, IOException {
//        String a  = "我是誰";
//        String b = "誰";
//        String c = "誰是";
//        System.out.println(a.indexOf(b));
//        System.out.println(a.indexOf(c));

        String z = "12345654321";
        String x = "56";
        String c = "0";
        String v = "1";
        String b = "3";
        String space = "  123456  ";
        String name = "My name is Jonathan.";
        String j = "Jonathan";
        String m = "My";

//        System.out.println(z.indexOf(x));   /*56是在第六位出現的*/
//        System.out.println(z.indexOf(c));  /*z裡面沒有0這個字元，所以回傳-1*/
//        System.out.println(z.indexOf(v,10));   /*z從第五位開始往後算v(1)是在第十位*/
//        System.out.println(z.lastIndexOf("2"));    /*z從第三位開始往後算最後出現b(3)是在第二位*/
//        System.out.println(space.trim());     /*用trim()就可以去掉字串前後的空白了*/

//        System.out.println(name.startsWith(m)); /*用來判斷字串開頭是不是由m開始的，是則回傳yes*/
//        System.out.println(name.endsWith(j));   /*用來判斷字串開頭是不是由j結束的，不是則回傳false*/
//        System.out.println(name.substring(3));  /*從第三位開始取字串name*/
//        System.out.println(name.substring(3,10));   /*將字串name從第三位開始取到第九位*/


        String o = "123465798";
        String p = "12";
        String l = "123";

        System.out.println(o.equals(p)); /*可以用equal比較兩個字串是否相同*/
        System.out.println(p.equals(l)); /*可以用equal比較兩個字串是否相同*/

        /*用compare可以比較兩字串不同的字串數*/
        System.out.println(o.compareTo(p)); /*結果為6，因為o比p多六個字串*/
        System.out.println(p.compareTo(o)); /*結果為-6，因為p比o少六個字串*/
        System.out.println(p.compareTo(l)); /*結果為0，因為p、l兩者的字串完全符合*/


    }

}