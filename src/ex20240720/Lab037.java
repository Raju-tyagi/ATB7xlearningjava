package ex20240720;
import java.util.Scanner;
import java.util.SortedMap;

public class Lab037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num_1 = sc.nextInt();

        System.out.println("Enter the Number2");
        int num_2=sc.nextInt();

        if (num_1 > num_2){
            System.out.println(num_1);
        }else if (num_1>num_2){
            System.out.println(num_2);
        }else {
            System.out.println("Equal");
        }
    }
}
