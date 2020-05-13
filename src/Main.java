import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        String geeting;
        Scanner sc = new Scanner(System.in);
        int running = 1;
        while (running==1){
            System.out.print("-> Geeting :");
            geeting = sc.nextLine();
            switch (geeting.toUpperCase()) {
                case "JAVA GREETING":
                    String name = "Hi KSHRD!";
                    for (int i = 0; i < name.length(); i++) {
                        System.out.print(name.charAt(i));
                        try {
                            Thread.sleep(300);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println();
                    String Point = "*************************************";
                    for (int i = 0; i < Point.length(); i++) {
                        System.out.print(Point.charAt(i));
                        try {
                            Thread.sleep(300);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println();
                    String Message = "I will try my best to be here at HRD.";
                    for (int i = 0; i < Message.length(); i++) {
                        System.out.print(Message.charAt(i));
                        try {
                            Thread.sleep(300);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println();
                    String Dolsub = "-------------------------------------";
                    for (int i = 0; i < Dolsub.length(); i++) {
                        System.out.print(Dolsub.charAt(i));
                        try {
                            Thread.sleep(300);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println();
                    String Download = "Downloading............";
                    for (int i = 0; i < Download.length(); i++) {
                        System.out.print(Download.charAt(i));
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println("Completed 100%");
                    break;
                case "EXIT":
                    running = 0;
                    System.out.println("=> Good bye!");
                    break;
                default:
                    System.out.println("=> input  'java Greeting' if you want to access!");
                    System.out.println("=> input  'exit' if you want to Exiting program!");
                    break;
            }
        }
    }
}
