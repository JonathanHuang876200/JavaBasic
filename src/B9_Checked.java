import java.io.IOException;
import java.text.ParseException;

public class B9_Checked {
    public static void main(String args[]) throws ParseException, IOException {


        String s1 = args[0] + ".exe";
        Runtime r1 = Runtime.getRuntime();
        try {
            Process proc = r1.exec("cmd /c" + "start " + s1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}