package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.RentApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneService {

    private static final String TITLE = "RentApplication";

    private static void openNewStage(String viewName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentApplication.class.getResource(viewName));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle(TITLE);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ignored) {}
    }

    public static void switchStage(String viewName, Stage currentStage) {
        openNewStage(viewName);
        currentStage.close();
    }
}
