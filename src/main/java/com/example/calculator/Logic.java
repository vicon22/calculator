package com.example.calculator;

public class Logic {
    public String bar = "0";
    String check = "0";

    public void changeSign(){
        int change = Integer.parseInt(bar);
        if (change != 0){
            change = -1 * change;
        }
        bar = Integer.toString(change);
    }

    public void addDigit(String digit){
        bar = bar + digit;
        int change = Integer.parseInt(bar);
        bar = Integer.toString(change);
    }
}
