package ex20240727;

public class Lab0109 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else{
                System.out.println("Arguments no given");

            }

        }
    }