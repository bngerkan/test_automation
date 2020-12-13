import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number1 = scan.nextInt();
        System.out.println("Please enter a number : ");
        int number2 = scan.nextInt();
        System.out.println("Please enter 1 for addition, 2 for subtraction, 3 for multiplication , 4 for division");
        int number3 = scan.nextInt();
        switch (number3) {
            case 1:
                int result1 = number1 + number2;
                System.out.println("result : " + result1);
                break;
            case 2:
                int result2 = number1 - number2;
                System.out.println("result : " + result2);
                break;
            case 3:
                int result3 = number1 * number2;
                System.out.println("result : " + result3);
                break;
            case 4:
                int result4 = number1 / number2;
                System.out.println("result : " + result4);
                break;


        }


    }

}