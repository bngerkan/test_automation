import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Enter : ");
        char operator=klavye.next().charAt(0);
        System.out.println(operator=='k');
    }
}
