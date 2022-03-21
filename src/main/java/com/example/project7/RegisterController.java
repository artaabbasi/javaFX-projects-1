package com.example.project7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterController {
    @FXML
    Label errLabel;
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;
    @FXML
    Button submitButton;
    @FXML
    Button loginButton;




    @FXML
    public void onSubmit(ActionEvent clickEvent) throws IOException {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        if (username.length()>0 && password.length()>=8){
            FileWriter userdata = new FileWriter("userdata.txt");
            userdata.write(username + ":" + password);
            userdata.close();
        }
        else{
            errLabel.setText("wrong information sent! password must be >7 chars.");
        }
    }

    @FXML
    public void onLogin(ActionEvent clickEvent) throws IOException {
        HelloApplication scene = new HelloApplication();
        scene.onChangeScene("login.fxml");
    }
}