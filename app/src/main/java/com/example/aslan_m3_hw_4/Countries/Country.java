package com.example.aslan_m3_hw_4.Countries;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String capital;
    private String detail;
    private String imgFlag;

    public Country(String name, String capital, String detail, String imgFlag) {
        this.name = name;
        this.capital = capital;
        this.detail = detail;
        this.imgFlag = imgFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(String imgFlag) {
        this.imgFlag = imgFlag;
    }
}
