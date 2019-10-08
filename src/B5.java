import java.io.IOException;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B5 {
    public static void main(String args[]) throws ParseException, IOException {
        Date now = new Date();
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("現在時間: " + time.format(now));

        /*字串轉換成日期格式*/
        /*給一個日期格式的字串，如何轉換成Date物件*/
        SimpleDateFormat f = new SimpleDateFormat("yyyy.MM.dd");
        Date day = f.parse("2003.11.10");
        System.out.println(f.format(day));


//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }
}