package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum

    @FXML
    private TextField numText1;
    @FXML
    private TextField numText2;


    // ToDo 02: when the button is clicked show the output on the screen

    @FXML
    private Button calculateButton;
    @FXML
    private Label resultLabel;

    @FXML
    protected void onCalculateButtonClick() {
        // ToDo 03: you should accept only the numeric values
        if (!isNumeric(numText1.getText()) || !isNumeric(numText2.getText())){
            resultLabel.setText("Only enter numeric values please :)");
            return;
        }
        double num1 = Double.parseDouble(numText1.getText());
        double num2 = Double.parseDouble(numText2.getText());
        double sum = num1 + num2;
        resultLabel.setText("Sum = " + sum);
    }

    private boolean isNumeric(String str){
        if (str ==null || str.trim().isEmpty()){
            return false;
        }
        try{
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }



    }



    }



    // ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red

    // ToDo 05: commit changes and push back to the same repo

