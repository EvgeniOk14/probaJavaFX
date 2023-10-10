module com.example.proba21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proba21 to javafx.fxml;
    exports com.example.proba21;
}