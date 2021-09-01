package com.example.aba;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {
    Scanner sc=new Scanner(System.in);

    @FXML
    private Label welcomeLabel;
    @FXML
    private TextField lnameTextField;
    @FXML
    private TextField nameTextField;

    @FXML
    private ChoiceBox<String> dept;
    @FXML
    private Label youLabel;
    @FXML
    private RadioButton rButton1;

    @FXML
    private RadioButton rButton2;
    @FXML
    private Label plabel;

    @FXML
    private CheckBox javaBox;

    @FXML
    private CheckBox pythonBox;

    @FXML
    private CheckBox JavaScript;


    public void getGender(ActionEvent event) {
        if (rButton1.isSelected())
            youLabel.setText(rButton1.getText());
        else if (rButton2.isSelected())
            youLabel.setText(rButton2.getText());

    }

    @FXML
    protected void onHelloButtonClick() {

        String name = nameTextField.getText();
        String lname = lnameTextField.getText();

        welcomeLabel.setText("Full Name:" + name + " " + lname  +"\n" + "DEPARTEMENT:" +dept.getValue() + "\n" + "Gender: " + youLabel.getText()+"\n"+plabel.getText());

    }
    @FXML
    private void HandleCourse(){
        if(javaBox.isSelected())
            plabel.setText(javaBox.getText());
        else if (pythonBox.isSelected())

            plabel.setText(pythonBox.getText());

        else if(JavaScript.isSelected()) {
            plabel.setText(JavaScript.getText());
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dept.getItems().addAll("IS", "IT", "CS", "SW");
    }

}