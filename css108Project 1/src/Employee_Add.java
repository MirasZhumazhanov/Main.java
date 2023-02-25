import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee_Add extends EmployeeDetail{

    public void createfile(){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee's name --------: ");
            name = sc.nextLine();

            System.out.print("Enter Employee's Age -:");
            age = sc.nextInt();

            System.out.print("Enter Employee's ID ----------: ");
            employId = sc.nextInt();

            System.out.print("Enter Employee's Email ID ----: ");
            email = sc.next();

            System.out.print("Enter Employee's Position ----: ");
            position = sc.next();
            sc.nextLine();

            System.out.print("Enter Employee contact Info --: ");
            employContact = sc.nextLong();

            System.out.print("Enter Employee's Salary ------: ");
            employSalary = sc.nextFloat();

            File file = new File(employId + ".txt");
            FileWriter write = new FileWriter(employId + ".txt");
            write.write("Employee ID: " + employId);
            write.write("\nEmployee Name: " + name);
            write.write("\nAge: " + age);
            write.write("\nEmployee Contact: " + employContact);
            write.write("\nEmail Information: " + email);
            write.write("\nEmployee Position: " + position);
            write.write("\nEmployee Salary: " + employSalary + "$");
            write.close();
            if(file.exists()){
                System.out.println("Employee has been created :)");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }catch (InputMismatchException IME){
            System.out.println("Enter appropriate values.");
        }
    }

    @Override
    public void employee_detail() {

    }
}
