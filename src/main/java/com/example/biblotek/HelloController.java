package com.example.biblotek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button login;


    @FXML
    protected void onloginClick(ActionEvent e) {
        Stage stage = (Stage) login.getScene().getWindow();
        stage.close();
    }
}