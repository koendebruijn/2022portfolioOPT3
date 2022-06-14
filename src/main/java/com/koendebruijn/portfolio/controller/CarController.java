package com.koendebruijn.portfolio.controller;

import com.koendebruijn.portfolio.model.Car;
import com.koendebruijn.portfolio.repository.CarRepository;
import com.koendebruijn.portfolio.service.SceneService;
import com.koendebruijn.portfolio.utils.StringUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

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
        List<String> errors = getErrors(brand, weight);

        if (!errors.isEmpty()) {
            errorMessage.setText(String.join("\n", errors));
        }

        carRepository.save(new Car(brand, Double.parseDouble(weight)));
        SceneService.switchStage("dashboard.fxml", (Stage) saveCar.getScene().getWindow());
    }

    private List<String> getErrors(String brand, String weight) {
        List<String> errors = new ArrayList<>();

        if (brand.isBlank()) errors.add("Merk kan niet leeg zijn");

        if (weight.isBlank()) errors.add("gewicht kan niet leeg zijn");

        if (!StringUtils.isDouble(weight)) errors.add("Gewicht moet een geldig nummer zijn");

        return errors;
    }

}
