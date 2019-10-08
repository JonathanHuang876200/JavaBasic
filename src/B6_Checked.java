import java.io.IOException;
import java.text.ParseException;

public class B6_Checked {
    public static void main(String args[]) throws ParseException, IOException {
        try {
            System.out.println("帶入的命令列引數是: " + args[0]);
//            System.out.println("args[]的屬性為: " + args[0].getClass()); /*測試args[0]的屬性*/
            int num = Integer.parseInt(args[0]); /*String轉Int*/
            num = num + 10;
            System.out.println("加10後的數值是: "+num);

        } catch (NumberFormatException e) {
            System.out.println("輸數字87逆!!");
        }



        /*我是分隔線*/
//        String num = String.valueOf(random);  /*把random轉為字串(num)*/
//        int Num = Integer.valueOf(num);  /*把字串(num)轉為int(Num)*/
//        System.out.println(Num);
//        Num = Num + 10;
//        System.out.print(Num);
    }
}