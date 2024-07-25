package ex20240720;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int user_input=sc.nextInt();
        System.out.println(user_input);

        if (user_input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}