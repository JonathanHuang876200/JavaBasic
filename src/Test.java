import java.io.*;

public class Test {

    public static void main(String args[]) throws IOException {

//            String line = null;
//            try {
//                InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\\\Users\\iminghuang\\IdeaProjects\\untitled\\src\\test.txt"), "UTF-8");
//                BufferedReader reader = new BufferedReader(isr);
//                while ((line = reader.readLine()) != null) {
//                    System.out.printf(line);
//                }
//                isr.close();
//            }
//        catch(Exception e){
//            System.out.println("讀取檔案內容操作出錯");
//            e.printStackTrace();
//        }
//    }
//        FileReader fr = new FileReader("C:\\\\Users\\iminghuang\\IdeaProjects\\untitled\\src\\test.txt");



        String str = null;

        FileInputStream fis = new FileInputStream("C:\\\\Users\\iminghuang\\IdeaProjects\\untitled\\src\\test.txt");
        InputStreamReader isr = new InputStreamReader(fis, "Big5");
        BufferedReader br = new BufferedReader(isr);


        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

    }
}

