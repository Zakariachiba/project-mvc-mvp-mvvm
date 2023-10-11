package com.alyndroid.architecturepatternstutorialshomework.ui;

import com.alyndroid.architecturepatternstutorialshomework.Pojo.MathCalc;

public class Presenter {

    ModeView modeView;
    public Presenter(ModeView interfaceView) {
        this.modeView = interfaceView;
    }

    public void getData(){
        modeView.getData(MathCalc.getMathCalc().DivNumbers());
    }


}
