import com.sun.scenario.Settings;


public class B8_Checked {

    public static void main(String[] args) {
//        System.out.println("args長度: " + args.length);
//        System.out.println("args[0]: " + args[0]);
//        System.out.println("args[1]: "+args[1]);

        try {
//            if (args[0].equals("-a") && args[1] != null) {
//                for (int i = 0; i <= args.length - 1; i++) {
//                    System.out.print(args[i] + " ");
//                }
//            } else {
//                if (!args[0].equals("-a")) {
//                    for (int i = 0; i <= args.length - 1; i++) {
//                        System.out.print(args[i] + " ");
//                        //                System.out.println(args[0] + "123");
//                    }
//                }
//            }

            if (!(args[0].equals("-a") && args[1] == null)) {
                for (int i = 0; i <= args.length - 1; i++) {
                    System.out.print(args[i] + " ");
                }
            }



        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Argument 2 is required.");

        }
    }
}

