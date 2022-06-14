module com.koendebruijn.portfolio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.koendebruijn.portfolio to javafx.fxml;
    exports com.koendebruijn.portfolio;

    opens com.koendebruijn.portfolio.controller to javafx.fxml;
    exports com.koendebruijn.portfolio.controller;
}