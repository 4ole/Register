module com.example.aba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aba to javafx.fxml;
    exports com.example.aba;
}