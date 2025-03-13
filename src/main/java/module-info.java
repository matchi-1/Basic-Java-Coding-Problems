module com.example.CodingPractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.CodingPractice to javafx.fxml;
    exports com.example.CodingPractice;
}