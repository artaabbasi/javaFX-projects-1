package com.example.project7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LoginController {
    @FXML
    Label errloginLabel;
    @FXML
    TextField usernameloginField;
    @FXML
    PasswordField passwordloginField;
    @FXML
    Button useroginButton;

    @FXML
    public void onuserLogin(ActionEvent clickEvent) throws IOException, InterruptedException {
        File userdata = new File("userdata.txt");
        Scanner myReader = new Scanner(userdata);
        String data = myReader.nextLine();
        String[] userdataParsed = data.split(":");
        myReader.close();
        String username = userdataParsed[0];
        String password = userdataParsed[1];
        if(usernameloginField.getText().equals(username) && passwordloginField.getText().equals(password)){
            HelloApplication scene = new HelloApplication();
            scene.onChangeScene("nurse.fxml");
        }
        else{
            errloginLabel.setText("Wrong user information!");
        }
    }
}
