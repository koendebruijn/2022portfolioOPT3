package com.koendebruijn.portfolio.controller;

import com.koendebruijn.portfolio.model.Car;
import com.koendebruijn.portfolio.repository.CarRepository;
import com.koendebruijn.portfolio.service.SceneService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CarController {
    private final CarRepository carRepository = CarRepository.getInstance();
    @FXML
    private TextField brandInput;
    @FXML
    private TextField weightInput;
    @FXML
    private Button saveCar;
    @FXML
    private Label errorMessage;

    @FXML
    private void handleSave() {
        String brand = brandInput.getText();
        String weight = weightInput.getText();

        if (weight.isEmpty()) {
            errorMessage.setText("Gewicht kan niet leeg zijn");
            return;
        }

        if (brand.isEmpty()) {
            errorMessage.setText("Merk kan niet leeg zijn");
            return;
        }

        try {
            carRepository.save(new Car(brand, Double.parseDouble(weight)));
            SceneService.openNewStage("dashboard.fxml", "RentApplication");
            Stage stage = (Stage) saveCar.getScene().getWindow();
            stage.close();
        } catch (NumberFormatException e) {
            errorMessage.setText("Voer bij gewicht een geldig nummer in");
        }
    }

}
