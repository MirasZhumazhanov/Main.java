import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class Employee_Update {
    long employContact;
    float employSalary;
    int employId;
    String position;
    String email;
    int age;
    String name;
    public void updateFile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the Employee you want to update: ");
        int ID = sc.nextInt();

        try {
            File file = new File(ID + ".txt");
            Scanner fileRead = new Scanner(file);
            while(fileRead.hasNextLine()){
                System.out.println(fileRead.nextLine());
            }
            System.out.println("Enter the detail you want to update. For example, If you want to change the Name, enter \"Name\" and then press Enter. ");
            String temp = sc.next();
            switch (temp){
                case "Name":
                    System.out.print("Enter updated Name: ");
                    name = sc.next();
                    System.out.println("Name updated successfully!");
                    break;
                case "Age":
                    System.out.print("Enter updated Age:");
                    age = sc.nextInt();
                    System.out.println("Age updated successfully!");
                    break;
                case "Email":
                    System.out.print("Enter updated Email: ");
                    email = sc.next();
                    System.out.println("Email updated successfully!");
                    break;
                case "Position":
                    System.out.print("Enter updated Position: ");
                    position = sc.next();
                    System.out.println("Position updated successfully!");
                    break;
                case "Salary":
                    System.out.print("Enter updated Salary: ");
                    employSalary = sc.nextFloat();
                    System.out.println("Salary updated successfully!");
                case "Contact":
                    System.out.print("Enter updated contact: ");
                    employContact = sc.nextLong();
                    System.out.println("Contact updated successfully!");
                    break;
                default:
                    System.out.println("Possible inputs \"Name\", \"Position\", \"Salary\", \"Contact\", \"Email\", \"Age\"");

            }

            FileWriter write = new FileWriter(ID + ".txt");
            write.write("Employee ID: " + employId);
            write.write("\nEmployee Name: " + name);
            write.write("\nAge: " + age);
            write.write("\nEmployee Contact: " + employContact);
            write.write("\nEmail Information: " + email);
            write.write("\nEmployee Position: " + position);
            write.write("\nEmployee Salary: " + employSalary + "$");
            write.close();
        }catch (IOException e) {
            System.out.println("This ID is not registered");
        }
    }
}
