module com.example.project7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project7 to javafx.fxml;
    exports com.example.project7;
}