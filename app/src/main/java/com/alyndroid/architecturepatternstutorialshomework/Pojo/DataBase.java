package com.alyndroid.architecturepatternstutorialshomework.Pojo;

public class DataBase {
    public static DataBase dataBase;

    public static DataBase getDataBase() {
        if (dataBase==null){
            dataBase = new DataBase();
        }
        return dataBase;
    }


    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
