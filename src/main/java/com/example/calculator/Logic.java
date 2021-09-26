package com.example.calculator;

public class Logic {
    public String answer = "0";
    public String bar = "0";
    public String bar_2 = "0";
    public int switcher = 0;

    public String changeSign(String mutable){
        if (mutable.contains("-")){
            mutable = mutable.substring(1);
        }
        else {
            mutable = "-" + mutable;
        }
        return (mutable);
    }

    public String addDigit(String mutable, String digit){
        if (mutable.equals("0")) {
            mutable = digit;
            return (mutable);
        }
        mutable = mutable + digit;
        return (mutable);
    }

    public String persent(String mutable){
        float ans = Float.parseFloat(mutable);
        ans = ans/100;
        mutable = Float.toString(ans);

        return (mutable);
    }
}
