package com.koendebruijn.portfolio;

import com.koendebruijn.portfolio.models.Car;
import com.koendebruijn.portfolio.models.Drill;
import com.koendebruijn.portfolio.models.Truck;
import com.koendebruijn.portfolio.repository.CarRepository;
import com.koendebruijn.portfolio.repository.DrillRepository;
import com.koendebruijn.portfolio.repository.TruckRepository;
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
        // Seeding drills
        DrillRepository drillRepository = DrillRepository.getInstance();
        drillRepository.save(new Drill("Bosch", "Easydrill 18V-40"));
        drillRepository.save(new Drill("Einhell", "TE-CD 18/40 Li Solo"));
        drillRepository.save(new Drill("BLACK+DECKER", "BDCDC18-QW"));

        // Seeding cars
        CarRepository carRepository = CarRepository.getInstance();
        carRepository.save(new Car("Skoda Octavia", 1238));
        carRepository.save(new Car("BMW X6", 2295));
        carRepository.save(new Car("Smart", 880));

        // Seeding trucks
        TruckRepository truckRepository = TruckRepository.getInstance();
        truckRepository.save(new Truck(5700, 11800));
        truckRepository.save(new Truck(8300, 25000));
        truckRepository.save(new Truck(11300, 39500));


    }
}