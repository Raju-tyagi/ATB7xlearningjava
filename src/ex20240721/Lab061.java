package ex20240721;

public class Lab061 {
    public static void main(String[] args) {
        int a =0;
        do {
            if (a%2==0){
                System.out.println("Even :" + a);
            }if (a%2!=0){
                System.out.println("Odd : " + a);
            }
            System.out.println("Whole Number : " + a);
            a++;
        }while (a<100);
    }
}
