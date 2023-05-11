module com.example.biblotek {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.biblotek to javafx.fxml;
    exports com.example.biblotek;
}