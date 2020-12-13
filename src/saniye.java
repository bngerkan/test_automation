import java.util.Scanner;

public class saniye {
    public static void main(String[] args) {

        System.out.println ("Please enter the time as second : ");
        Scanner scan = new Scanner (System.in);
        int second =scan.nextInt();
        int minute = second/60;
        int leftSecond = second % 60 ;
        System.out.println( second + " second is equal to " + minute + " minutes and " + leftSecond + " second");
    }
}
