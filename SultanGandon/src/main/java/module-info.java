module com.example.sultangandon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sultangandon to javafx.fxml;
    exports com.example.sultangandon;
}