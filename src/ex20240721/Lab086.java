package ex20240721;

public class Lab086 {
    static String function_type6(String first_name, String last_name ){
        return first_name+last_name;
    }

    public static void main(String[] args) {
        String full_name = function_type6("Hello", " Guys");
        System.out.println(full_name);
    }
}
