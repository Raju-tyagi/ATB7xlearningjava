package ex20240720;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Postive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else
            System.out.println("Zero");
    }
        }
