package com.example.biblotek;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;

import static java.lang.Thread.sleep;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
        HelloController helloController = fxmlLoader.getController();
        helloController.settext();
    }



    public static void main(String[] args) {
        launch();
    }
}