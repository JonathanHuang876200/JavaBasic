import java.io.IOException;
import java.text.ParseException;

public class B2_Checked {
    public static void main(String args[]) throws ParseException, IOException {
        String str1 = "select * from abc";
        String str2 = " where id=2";
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1).append(str2);
//        buffer.insert(0, str1);
//        buffer.insert(str1.length(), str2);
        System.out.print(buffer.toString());

//        sb1.delete(0, sb1.length());  /*清空數值*/

//        StringBuilder builder = new StringBuilder();
//        builder.append("測試");
//        builder.append("字串");
//        builder.insert(2,"ABC");
////        builder.delete(4,5);
//        System.out.println(builder.toString());
    }
}
