package ex20240721;

public class Lab058 {
    public static void main(String[] args) {
        int a=0;
        while(a<100){
            if(a%2==0){
                System.out.println("Even : " + a);
            }if(a%2!=0){
                System.out.println("Odd : " +a);
            }
            System.out.println("Whole Number : " + a);
            a++;
        }
    }
}
