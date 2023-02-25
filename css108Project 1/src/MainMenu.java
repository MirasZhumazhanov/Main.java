import java.util.Scanner;

public class MainMenu {

    public void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("            ***************************************" + "\n               " +
                "Organization Management System " +
                "\n            ***************************************");


        System.out.println("\n");


        System.out.println("Press 1: Add an Employee Details");
        System.out.println("Press 2: See an Employee Details");
        System.out.println("Press 3: Remove an Employee");
        System.out.println("Press 4: Update Employee Detail");
        System.out.println("Press 5: Exit the EMS Portal");


    }
}
