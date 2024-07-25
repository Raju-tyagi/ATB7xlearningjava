package ex20240720;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!! where you want to execute the code");
        String browser_name = sc.next();
        browser_name=browser_name.toLowerCase();

        switch (browser_name){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "Edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("No idea which browser is this");
                break;
        }

    }
}
