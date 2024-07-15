package com.billsburgers;

class Side {

    private String type;
    private double price;

    public Side(String type, double price) {

        this.type = type;
        this.price = price;
    }

    public String getPrice() {

        return String.format("%.2f", price);
    }

    public String getSideBill() {

        return String.format("%s - $", type);
    }
}
