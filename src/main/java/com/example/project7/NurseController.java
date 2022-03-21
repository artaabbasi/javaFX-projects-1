package com.example.project7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NurseController {

    @FXML
    TextField nameField;
    @FXML
    TextField ageField;
    @FXML
    TextField diseaseField;
    @FXML
    TextField docField;
    @FXML
    Button docButton;
    @FXML
    Button patientSubmit;


    @FXML
    public void onDoc(ActionEvent clickEvent) throws IOException {
        HelloApplication scene = new HelloApplication();
        scene.onChangeScene("doc.fxml");
    }

    @FXML
    public void onpatientSubmit(ActionEvent clickEvent) throws IOException {
    String age = ageField.getText().toString();
    String name = nameField.getText().toString();
    String disease = diseaseField.getText().toString();
    String doc = docField.getText().toString();
    ageField.clear();
    nameField.clear();
    diseaseField.clear();
    docField.clear();
    BufferedWriter userdata = new BufferedWriter(new FileWriter("patients.txt", true));
    userdata.append("\n" + name + ":" + age + ":" + disease + ":" + doc);
    userdata.close();
    }
}
