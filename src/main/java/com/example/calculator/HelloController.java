package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    Logic logic = new Logic();

    @FXML
    private Label welcomeText;

    @FXML
    protected void clean() {
        logic.bar = "0";
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void changeSign() {
        logic.changeSign();
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void takePersent() {
        welcomeText.setText("takePersent");
    }

    @FXML
    protected void division() {
        welcomeText.setText("division");
    }

    @FXML
    protected void multiplication() {
        welcomeText.setText("multiplication");
    }

    @FXML
    protected void subtraction() {
        welcomeText.setText("subtraction");
    }

    @FXML
    protected void addition() {
        welcomeText.setText("addition");
    }

    @FXML
    protected void point() {
        welcomeText.setText("point");
    }

    @FXML
    protected void getAnswer() {
        welcomeText.setText("getAnswer");
    }

    @FXML
    protected void take_0() {
        logic.addDigit("0");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_1() {
        logic.addDigit("1");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_2() {
        logic.addDigit("2");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_3() {
        logic.addDigit("3");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_4() {
        logic.addDigit("4");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_5() {
        logic.addDigit("5");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_6() {
        logic.addDigit("6");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_7() {
        logic.addDigit("7");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_8() {
        logic.addDigit("8");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_9() {
        logic.addDigit("9");
        welcomeText.setText(logic.bar);
    }
}