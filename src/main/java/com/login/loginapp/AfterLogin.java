package com.login.loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;
    public void userlogOut(ActionEvent event)  throws IOException {

        Main m = new Main();

        m.changeScene("Login.fxml");


    }
}
