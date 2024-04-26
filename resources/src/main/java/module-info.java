module com.example.resources {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resources to javafx.fxml;
    exports com.example.resources;
}