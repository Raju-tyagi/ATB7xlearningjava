package ex20240727;

public class Lab098 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 4; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int K = 1; K <=i ; K++) {
                System.out.print(i);
            }
            System.out.println();

            }
        }
    }