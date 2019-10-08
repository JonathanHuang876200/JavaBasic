import javax.security.auth.Subject;
import javax.sound.midi.Soundbank;
import java.io.*;
import java.text.ParseException;

public class B10_Checked {

    public static void main(String args[]) throws IOException {

        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\\\Users\\iminghuang\\IdeaProjects\\A3\\NameValue.properties");
//            C:\\Users\iminghuang\IdeaProjects\untitled\src\test.txt
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            System.out.println("把BufferReader關掉了啦~");
            br.close();
        }
    }


}
