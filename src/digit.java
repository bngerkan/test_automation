public class digit {
    public static void main(String[] args) {
        int number = 500;
        if (number < 10) {
            System.out.println("Number is one digit");
        } else if (number > 9 && number < 100) {
            System.out.println("Number is two digit");
        } else {
            System.out.println("Number is there digit or more");
        }
    }
}
