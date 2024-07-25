package ex20240721;

public class Lab059 {
    public static void main(String[] args) {
        int a = 0;
        do {
            if (a%2==0) {
                System.out.println("Even : " + a);
            }
                a++;
        }while(a<100);
    }
}
