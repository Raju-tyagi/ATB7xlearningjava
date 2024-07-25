package ex20240721;

public class Lab077 {
    public static void main(String[] args) {
        for (int a = 1; a<10; a++ ){
            System.out.println(a);
            if(a==5){
                continue;
            }

            System.out.println("After");
        }
    }
}
