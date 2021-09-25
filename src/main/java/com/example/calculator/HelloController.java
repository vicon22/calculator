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
        logic.bar = logic.changeSign(logic.bar);
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void takePersent() {
        logic.bar = logic.persent(logic.bar);
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void division() {
        logic.bar_2 = logic.bar;
        logic.bar = "0";
        logic.switcher = 1;
        //welcomeText.setText("division");
    }

    @FXML
    protected void multiplication() {
        logic.bar_2 = logic.bar;
        logic.bar = "0";
        logic.switcher = 2;
        //welcomeText.setText("multiplication");
    }

    @FXML
    protected void subtraction() {
        logic.bar_2 = logic.bar;
        logic.bar = "0";
        logic.switcher = 3;
        //welcomeText.setText("subtraction");
    }

    @FXML
    protected void addition() {
        logic.bar_2 = logic.bar;
        logic.bar = "0";
        logic.switcher = 4;
        //welcomeText.setText("addition");
    }

    @FXML
    protected void point() {
        logic.bar = logic.addDigit(logic.bar, ".");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void getAnswer() {

        int ans = 999999;

        if (logic.switcher == 1) {
            ans = Integer.parseInt(logic.bar_2) / Integer.parseInt(logic.bar);
        }
        if (logic.switcher == 2) {
            ans = Integer.parseInt(logic.bar_2) * Integer.parseInt(logic.bar);
        }
        if (logic.switcher == 3) {
            ans = Integer.parseInt(logic.bar_2) - Integer.parseInt(logic.bar);
        }
        if (logic.switcher == 4) {
            ans = Integer.parseInt(logic.bar_2) + Integer.parseInt(logic.bar);
        }

        logic.answer = Integer.toString(ans);
        welcomeText.setText(logic.answer);
    }

    @FXML
    protected void take_0() {
        logic.bar = logic.addDigit(logic.bar, "0");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_1() {
        logic.bar = logic.addDigit(logic.bar, "1");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_2() {
        logic.bar = logic.addDigit(logic.bar, "2");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_3() {
        logic.bar = logic.addDigit(logic.bar, "3");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_4() {
        logic.bar = logic.addDigit(logic.bar, "4");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_5() {
        logic.bar = logic.addDigit(logic.bar, "5");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_6() {
        logic.bar = logic.addDigit(logic.bar, "6");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_7() {
        logic.bar = logic.addDigit(logic.bar, "7");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_8() {
        logic.bar = logic.addDigit(logic.bar, "8");
        welcomeText.setText(logic.bar);
    }

    @FXML
    protected void take_9() {
        logic.bar = logic.addDigit(logic.bar, "9");
        welcomeText.setText(logic.bar);
    }
}