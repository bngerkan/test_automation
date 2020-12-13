import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner klavye= new Scanner (System.in);
        System.out.println("Please enter the student's grade : ");
        String grade= klavye.nextLine();
        switch(grade){
            case "A":
                System.out.println("Excellent work");
                break;
            case "B":
                System.out.println("Good work");
                break;
            case "C":
                System.out.println("Average work");
                break;
            case "D":
                System.out.println("Need improvement");
                break;
            case "F": // default :
                System.out.println("Failed");
                break;

        }
    }


}
