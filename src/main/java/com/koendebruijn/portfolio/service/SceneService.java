package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.RentApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneService {
    public static void openNewStage(String viewName, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RentApplication.class.getResource(viewName));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
