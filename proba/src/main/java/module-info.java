module com.example.proba {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.proba to javafx.fxml;
    exports com.example.proba;
}