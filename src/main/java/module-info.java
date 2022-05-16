module com.koendebruijn.portfolio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.koendebruijn.portfolio to javafx.fxml;
    exports com.koendebruijn.portfolio;
}