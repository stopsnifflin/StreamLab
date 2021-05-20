package edu.sdccd.cisc191;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.sql.Date;

public class FoodTable {

    @CsvBindByName(column = "Number")
    private int num;

    @CsvBindByName(column = "Food Name")
    private String food;

    @CsvBindByName(column = "Calories")
    private int calorie;


    public String food;
    public String calorie;
    public String foodNum;

    public void setFoodNum(String foodNum) {
        this.foodNum = foodNum;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getFoodNum() {
        return foodNum;
    }

    public String getFood() {
        return food;
    }

    public String getCalorie() {
        return calorie;
    }

    @Override
    public String toString()
    {
        return "FoodTable [Food Number =" + foodNum + ", food name =" + food + ", calorie = "  + calorie;

    }


}
