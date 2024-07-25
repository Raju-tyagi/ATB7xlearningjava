package ex20240720;

public class Lab044 {
    public static void main(String[] args) {
        int item_code =005;
        switch (item_code){
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003,004 -> System.out.println("It is a mobile");
            default -> System.out.println("Hello");
        }

    }
}
