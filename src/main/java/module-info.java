module com.koendebruijn.portfolio {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.koendebruijn.portfolio to javafx.fxml;
    exports com.koendebruijn.portfolio;
}