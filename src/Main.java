import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //TASK No.1
        int a;
        int b;

        System.out.println("Please enter number");
        a = sc.nextInt();
        System.out.println("Please enter number");
        b = sc.nextInt();

        boolean equal = false;
        boolean lessIsA = false;
        boolean lessOrEqual = false;
        boolean greaterIsA = false;
        boolean greaterOrEqual = false;

        if(a==b) {
            equal = true;
        }
        if(a < b) {
            lessIsA = true;
        }
        if (a <= b) {
            lessOrEqual = true;
        }
        if(a > b) {
            greaterIsA = true;
        }
        if(a >= b) {
            greaterOrEqual = true;
        }
        System.out.println("Is " + a + " equal to " + b + "? " + equal);
        System.out.println("Is " + a + " less than " + b + "? " + lessIsA);
        System.out.println("Is " + a + " less or equal to " + b + "? " + lessOrEqual);
        System.out.println("Is " + a + " greater than " + b + "? " + greaterIsA);
        System.out.println("Is " + a + " greater or equal to " + b + "? " + greaterOrEqual);

        //TASK No.2
        System.out.println("Please enter boolean value (true or false)");
        boolean booleanA = sc.nextBoolean();
        System.out.println("Please enter 2nd boolean value (true or false)");
        boolean booleanB = sc.nextBoolean();
        int booleanResult = Boolean.compare(booleanA, booleanB);
        boolean booleanC = false;
        if(booleanResult == 0) {
            booleanC = true;
        }
        System.out.println("Is 1st and 2nd boolean equal? " + booleanC);

        //Task No.3
        System.out.println("Please enter a whole number");
        int wholeNumber = sc.nextInt();
        boolean isWholeNumber = false;
        if (wholeNumber%2 == 0) {
            isWholeNumber = true;
            System.out.println("Number is whole " + isWholeNumber);
        } else {
            System.out.println("Number is odd " + isWholeNumber);
        }

        //Task No.4
        if (!(wholeNumber%2 == 0)) {
            System.out.println("Number is whole " + !isWholeNumber);
        } else {
            System.out.println("Number is odd " + !isWholeNumber);
        }

        //Task No.5
        System.out.println("Please enter boolean value (true or false)");
        boolean booleanReverse = sc.nextBoolean();

        if(booleanReverse) {
            System.out.println("You entered " + false);
        } else {
            System.out.println("You entered " + true);
        }

        //Task No.6
        System.out.println("Please enter an number");
        int numberATask6 = sc.nextInt();
        System.out.println("Please enter an number");
        int numberBTask6 = sc.nextInt();

        if (numberATask6 == numberBTask6
                || numberATask6 < 0 && numberBTask6 > 0
                || numberATask6 > 100 && numberBTask6 > 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}