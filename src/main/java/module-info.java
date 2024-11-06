module com.example.csc311_module5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_module5 to javafx.fxml;
    exports com.example.csc311_module5;
}