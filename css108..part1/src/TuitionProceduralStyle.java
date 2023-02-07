import java.util.Scanner;

public class TuitionProceduralStyle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first course name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter first course number of credits: ");
        int firstNumberOfCredits = sc.nextInt();
        System.out.print("Enter first course cost per credit: ");
        int firstCPC = sc.nextInt();

        System.out.println(" ");

        System.out.print("Enter second course name: ");
        String ab = sc.nextLine();
        String secondName = sc.nextLine();
        System.out.print("Enter second course number of credits: ");
        int secondNumberOfCredits = sc.nextInt();
        System.out.print("Enter second course cost per credit: ");
        int secondCPC = sc.nextInt();

        System.out.println(firstName + " " + TuitionFee(firstNumberOfCredits,firstCPC) + " kzt");
        System.out.println(secondName + " " + TuitionFee(secondNumberOfCredits, secondCPC) + " kzt");
        int a = TuitionFee(firstNumberOfCredits, firstCPC);
        int b = TuitionFee(secondNumberOfCredits,secondCPC);

        if (a > b) System.out.println(firstName + " 's tuition is greater than " + secondName + " and difference is: " + (a - b));
        else if(a < b) System.out.println(secondName + " 's tuition is greater than " + firstName + " and difference is: " + (b - a));
        else System.out.println("Both tuition is equal");
    }

    public static int TuitionFee(int a, int  b){
        return a * b;
    }
}
