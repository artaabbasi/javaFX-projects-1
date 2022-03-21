package com.example.project7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DocController {

    public ObservableList<String> patients = FXCollections.observableArrayList();

    @FXML
    ListView listView;

    @FXML
    Button nurseButton;
    




    @FXML
    public void onNurse(ActionEvent clickEvent) throws IOException {
        HelloApplication scene = new HelloApplication();
        scene.onChangeScene("nurse.fxml");
    }

    @FXML
    public void onShow(ActionEvent clickEvent) throws FileNotFoundException {
        File userdata = new File("patients.txt");
        Scanner myReader = new Scanner(userdata);

        for(int i=0; myReader.hasNextLine();i++){
            patients.add(myReader.nextLine().toString());
        }
        myReader.close();
        listView.setItems(patients);

    }
}

