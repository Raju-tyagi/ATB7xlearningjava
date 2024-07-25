package ex20240720;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a = sc.nextInt();
        System.out.println("Enter the number of b");
        int b = sc.nextInt();
        System.out.println("Enter the number of c");
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("All sides are equals of triangle");
        }else {
            System.out.println("All sides are not unequal of triangle");
        }
    }
}
