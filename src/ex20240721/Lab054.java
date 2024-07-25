package ex20240721;

public class Lab054 {
    public static void main(String[] args) {
        for(int a=0; a<100; a++){
            if(a%2==0){
                System.out.println("Even : " + a);
            }if(a%2!=0) {
                System.out.println("Odd : " + a);
            }
            System.out.println("Whole Number : " + a);
        }
    }
}
