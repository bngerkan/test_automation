import java.util.Scanner;

public class ArrayWhileLoop {
    public static void main(String[] args) {
        double [] doubleValues = new double[10];
        int i=0;
        double sum =0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers to get the average :");
        while (i < doubleValues.length) {
            doubleValues[i] = scanner.nextDouble();
            sum = sum + doubleValues [i];
            i++;
        }
        average = sum / doubleValues.length ;
        System.out.println("The average is : " + average);
    }
}
