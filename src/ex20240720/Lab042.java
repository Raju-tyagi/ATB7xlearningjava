package ex20240720;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, if it is a vowel or not!");
        char user = sc.next().charAt(0);
        System.out.println(user);

        switch (user){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("It is a constant");
                break;
        }
    }
}
