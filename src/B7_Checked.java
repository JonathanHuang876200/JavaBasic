import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class B7_Checked {

    public static void main(String[] args) throws ParseException {



        /*利用Calendar設定日期、時間*/
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2003);
        cal.set(Calendar.MONTH, 11 - 1); /*因為1月是第0位，11月是第10位*/
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR, 20);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);
//        cal.set(2003,11,10);
        /*將Calendar轉為Date*/
        Date date = cal.getTime();

        /*將Date轉換輸出格式*/
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f.format(date));

        long diff = date.getTime();     /*回傳自1970-1-1經過的milliseconds*/
        System.out.println("總共經過: " + diff + " milli-seconds");
        /*========================================================================================================*/

        /*設定台灣時區*/
        Calendar today = Calendar.getInstance(Locale.TAIWAN);

        /*用Calendar的add方法將今天月份減1*/
        today.add(Calendar.MONTH, -1);      /*拿掉就是今天現在的日期時間*/

        /*將Calendar轉為Date*/
        Date date1 = today.getTime();

        /*以f的格式印出date1*/
        System.out.print("今天往前一個月的日期: " + f.format(date1));


    }


//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd\n" +
//                "        Date date = df.parse(\"2003/11/10\");\n" +
//                "        Calendar calendar = Calendar.getInstance();\n" +
//                "        calendar.setTime(date);\n" +
//                "        System.out.println(sdf.format(calendar.getTime()));\n" +
//                "        //  利用 set 直接輸入日期\n" +
//                "        calendar.set(2003, Calendar.NOVEMBER, 10);\n" +
//                "        System.out.println(sdf.format(calendar.getTime()));\n" +
//                "\n" +
//                "        直接格式化輸出現在時間的方法\n" +
//                "        SimpleDateFormat sdFormat = new SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss.SSS\");\n" +
//                "        Date current = new Date();\n" +
//                "        System.out.println(sdFormat.format(current)); HH:mm:ss");
//        //  利用 DateFormat 來parse 日期的字串
//        DateFormat df = DateFormat.getDateInstance();
//    }
}