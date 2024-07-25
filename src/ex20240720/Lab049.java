package ex20240720;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println("Enter the Number2");
        int num2 = sc.nextInt();

        System.out.println("Enter the Number3");
        int num3 = sc.nextInt();
        
        if (num>num2 && num>num3) {
            System.out.println("num is greater");
        } else if (num2>num && num2>num3) {
            System.out.println("Num 2 is greater");
        }else {
            System.out.println("Num 3 is greater");

    }
    }
}
