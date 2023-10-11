package com.alyndroid.architecturepatternstutorialshomework.Pojo;

public class MathCalc {


   private static MathCalc mathCalc;


    public static MathCalc getMathCalc() {
        if (mathCalc ==null){
            mathCalc = new MathCalc();
        }
        return mathCalc;
    }



    public int AddِِNumbers(){
        return  DataBase.getDataBase().getNumbers().getFirstNum()+DataBase.getDataBase().getNumbers().getSecondNum();
    }
    public int DivNumbers(){
        return  DataBase.getDataBase().getNumbers().getFirstNum()-DataBase.getDataBase().getNumbers().getSecondNum();
    }
    public int MulNumbers(){
        return  DataBase.getDataBase().getNumbers().getFirstNum()*DataBase.getDataBase().getNumbers().getSecondNum();
    }

}
