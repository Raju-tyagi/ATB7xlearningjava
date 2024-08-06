package ex20240727;

import java.util.Scanner;

public class Lab0101 {
    public static void main(String[] args) {
        int [] marks_10_board = new int[3];
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        marks_10_board[0] = sc.nextInt();
        marks_10_board[1] = sc.nextInt();
        marks_10_board[2] = sc.nextInt();
        System.out.println(marks_10_board[0]);
        System.out.println(marks_10_board[1]);
        System.out.println(marks_10_board[2]);

    }
}
