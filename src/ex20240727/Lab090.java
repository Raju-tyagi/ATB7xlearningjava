package ex20240727;

import java.util.Arrays;

public class Lab090 {
    public static void main(String[] args) {
        int[] second = {95,90,85,70,55};
        int max= 1;
        for (int i = 1; i < second.length; i++) {
            if (second[i] > max) {
                max = second[i];
            }
            }
            System.out.println(max);
        }

    }