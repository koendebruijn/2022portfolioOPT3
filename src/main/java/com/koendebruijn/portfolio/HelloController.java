package com.koendebruijn.portfolio;

import com.koendebruijn.portfolio.repository.DrillRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label counterLabel;
    private int count = 0;

    @FXML
    private Button decrementButton;

    private final DrillRepository drillRepository = DrillRepository.getInstance();

    @FXML
    public void initialize() {
        decrementButton.setDisable(true);
        updateCountLabel();
    }

    @FXML
    protected void incrementCounter() {
        count += 1;
        if (count >= 0) {
            decrementButton.setDisable(false);
        }
        updateCountLabel();
    }

    @FXML
    protected void decrementCounter() {
        count -= 1;

        if (count == 0) {
            decrementButton.setDisable(true);
        }
        updateCountLabel();
    }

    private void updateCountLabel() {
        counterLabel.setText(drillRepository.findAll().get(0).brand());
    }
}