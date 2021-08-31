package com.geektech.homeworkapplicationfragmentsviewpager.ui;

public class Exchange {

    private int imageExchange;
    private String nameExchange;
    private String usdExchange;

    public Exchange(int imageExchange, String nameExchange, String usdExchange) {
        this.imageExchange = imageExchange;
        this.nameExchange = nameExchange;
        this.usdExchange = usdExchange;
    }

    public int getImageExchange() {
        return imageExchange;
    }

    public void setImageExchange(int imageExchange) {
        this.imageExchange = imageExchange;
    }

    public String getNameExchange() {
        return nameExchange;
    }

    public void setNameExchange(String nameExchange) {
        this.nameExchange = nameExchange;
    }

    public String getUsdExchange() {
        return usdExchange;
    }

    public void setUsdExchange(String usdExchange) {
        this.usdExchange = usdExchange;
    }
}
