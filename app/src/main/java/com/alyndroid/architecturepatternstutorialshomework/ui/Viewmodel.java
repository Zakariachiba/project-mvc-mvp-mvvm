package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.Pojo.MathCalc;

public class Viewmodel extends ViewModel {

    public MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
    public void getData(){
        int result = MathCalc.getMathCalc().MulNumbers();
        mutableLiveData.setValue(result);
    }
}
