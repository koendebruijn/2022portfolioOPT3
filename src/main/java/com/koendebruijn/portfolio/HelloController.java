package com.koendebruijn.portfolio;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label counterLabel;
    private int count = 0;

    @FXML
    private Button decrementButton;

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
        counterLabel.setText(String.format("counter: %d", count));
    }
}