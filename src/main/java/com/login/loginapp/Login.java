package com.login.loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.io.IOException;

public class Login {

        public Login() {

}


    @FXML
    private Button button;

    @FXML
    private Label wrongLogin;

    @FXML
    private TextField Username;

    @FXML
    private PasswordField Password;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if (Username.getText().toString().equals("Admin") && Password.getText().toString().equals("123")) {
            wrongLogin.setText("Success!");

            m.changeScene("afterLogin.fxml");
        }
        else if(Username.getText().isEmpty() && Password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");
        }

        else {
                wrongLogin.setText("Wrong Username or Password");
        }
        }
}