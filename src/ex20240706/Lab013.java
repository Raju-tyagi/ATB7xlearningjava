package ex20240706;

public class Lab013 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(b);

        int a1 = 20;
//        byte c1 =a1; //invalid
        byte b1 = (byte) a1;
        System.out.println(b1   );
    }
}
