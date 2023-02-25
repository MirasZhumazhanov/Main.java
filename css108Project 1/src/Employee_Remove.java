import java.io.File;

public class Employee_Remove implements Remove{

    @Override
    public void removeFile(int ID) {
        File file = new File(ID + ".txt");
        if(file.exists()){
            file.delete();
            System.out.println("Employee has been removed Successfully ");
        }
        else System.out.println("File doesn't exist");
    }
}
