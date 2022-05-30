package com.koendebruijn.portfolio;

import com.koendebruijn.portfolio.models.Drill;
import com.koendebruijn.portfolio.repository.DrillRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.UUID;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        seed();
        launch();
    }

    private static void seed() {
        DrillRepository drillRepository = DrillRepository.getInstance();
        drillRepository.save(new Drill(UUID.randomUUID(), "Bosch", "Easydrill 18V-40"));
        drillRepository.save(new Drill(UUID.randomUUID(), "Einhell", "TE-CD 18/40 Li Solo"));
        drillRepository.save(new Drill(UUID.randomUUID(), "BLACK+DECKER", "BDCDC18-QW"));

    }
}