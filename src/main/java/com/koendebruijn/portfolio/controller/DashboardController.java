package com.koendebruijn.portfolio.controller;

import com.koendebruijn.portfolio.model.Car;
import com.koendebruijn.portfolio.repository.CarRepository;
import com.koendebruijn.portfolio.service.SceneService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.util.List;

public class DashboardController {
    private final CarRepository carRepository = CarRepository.getInstance();
    @FXML
    private MenuItem newCar;

    @FXML
    private MenuBar menuBar;

    @FXML Label carsLabel;

    @FXML
    private void initialize() {
        List<String> displayNames = carRepository
                .findAll()
                .stream()
                .map(Car::toString)
                .toList();

        carsLabel.setText(String.join("\n", displayNames));
    }

    @FXML
    private void openNewCarStage() {
        SceneService.switchStage("add-car.fxml",  (Stage) menuBar.getScene().getWindow());
    }




}
