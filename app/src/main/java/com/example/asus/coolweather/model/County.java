package com.example.asus.coolweather.model;

/**
 * Created by asus on 2016/6/28.
 */
public class County {
    private  int id;
    private  String countyName;
    private  String countyCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void  setId(int id){
        this.id=id;
    }
    public  String getcountyName(){
        return countyName;
    }
    public void setcountyName(String countyName){
        this.countyName=countyName;
    }
    public String getcountyCode(){
        return countyCode;
    }
    public void setcountyCode(String countyCode){
        this.countyCode=countyCode;
    }
    public int getCityId(){
        return provinceId;
    }
    public  void setCityId(int provinceId){
        this.provinceId=provinceId;
    }
}
