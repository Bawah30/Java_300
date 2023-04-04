module com.example.atu_clinc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atu_clinc to javafx.fxml;
    exports com.example.atu_clinc;
}