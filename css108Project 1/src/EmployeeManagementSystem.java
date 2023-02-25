import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.SortedMap;


public  class EmployeeManagementSystem extends MainMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MainMenu obj1 = new MainMenu();

            obj1.menu();
            System.out.print("\nPlease Enter your choice: ");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    Employee_Add add1 = new Employee_Add();
                    add1.createfile();
                    break;
                case 2:
                    Employee_Show show = new Employee_Show();
                    System.out.print("Please Enter Employee's ID: ");
                    String ID = sc.next();
                    show.viewFile(ID);
                    break;
                case 3:
                    Employee_Remove remove = new Employee_Remove();
                    System.out.print("Please Enter Employee's ID: ");
                    int num = sc.nextInt();
                    remove.removeFile(num);
                    break;
                case 4:
                    Employee_Update update = new Employee_Update();
                    update.updateFile();
                    break;
                case 5:
                    CodeExit exit = new CodeExit();
                    exit.out();
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
        }
    }
}