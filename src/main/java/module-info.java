module com.example.synergyfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.synergyfx to javafx.fxml;
    exports com.example.synergyfx;
}