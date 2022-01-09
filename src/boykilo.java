import java.util.Scanner;

public class boykilo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz =");
        double boy=input.nextDouble();
        System.out.print("kilonuzu giriniz =");
        double kilo=input.nextInt();
       double endex=(kilo/(boy*boy));
        System.out.println("boy kilo endexiniz= "+endex);

    }
}
