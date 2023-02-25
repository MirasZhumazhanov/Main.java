import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Employee_Show {
    public void viewFile(String s){
        String ID = s;
        try {
            Scanner fileRead = new Scanner(new File(ID + ".txt"));
            while(fileRead.hasNextLine()){
                System.out.println(fileRead.nextLine());
            }

        }catch (IOException e) {
            System.out.println("This ID is not registered");
        }

    }
}
