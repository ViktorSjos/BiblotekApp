package com.example.biblotek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Thread.sleep;

public class HelloController implements Initializable {

//    DatabaseConnection d;
//
//    public HelloController(DatabaseConnection de) throws InterruptedException {
//        d = de;
//    }
    @FXML
    private Button login;
    @FXML
    private TextArea textdisplayy;

    @FXML
    private Button cancel;

// ...



    @FXML
    protected void onCancelClick(ActionEvent e) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onLoginClick(ActionEvent e) {
        String s = DatabaseConnection.connect();
        textdisplayy.textProperty().setValue(s);
    }

    protected void settext() throws InterruptedException {
        textdisplayy.textProperty().setValue("New text");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}