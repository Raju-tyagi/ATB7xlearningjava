package ex20240720;

public class Lab043 {
    public static void main(String[] args) {
        int itemcode = 005;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadgets");
                break;
            case 004,005,006:
                System.out.println("It is Mechnical Gadgets");
                break;
            default:
                System.out.println("None");

        }
    }
}
