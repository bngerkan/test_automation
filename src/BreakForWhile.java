import java.util.Scanner;

public class BreakForWhile {
    public static void main(String[] args) {
 /*       int num = 0 ;
        while(num<5){
            num ++;
            if ( num == 3){
                break;
            }
            System.out.println(num);
        } */

/*    for (int num=1; num<5;num++){
        if (num==3){
            break;
        }
            System.out.println(num);
        }


 for (int num=1; num<11;num++){
     System.out.println(num);
 }
*/

  Scanner scan = new Scanner(System.in) ;
        System.out.println("Please enter a number");
        int num= scan.nextInt();
        int total=0;
        for (int i=1; i<=num;i++) {
            total = total + i ; // total += i;
                    }
        System.out.println("Sum" +total);
    }
}
