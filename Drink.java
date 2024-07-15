package com.billsburgers;

class Drink {

    private String type, size;
    private double price;

    public Drink(String type, String size) {

        this.type = type;
        this.size = size;
        price = getPriceBasedOnSize(size);
    }

    public String getPrice() {

        return String.format("%.2f", price);
    }

    public String getDrinkBill() {

        return String.format("%s (%s) - $", type, size);
    }

    public void changeSize(String newSize) {

        size = newSize;
        price = getPriceBasedOnSize(size);
    }

    public double getPriceBasedOnSize(String size) {

        return switch (size) {
            case "S" -> 0.75;
            case "M" -> 0.90;
            case "L" -> 1.00;
            case "XL" -> 1.15;
            default -> 0.00;
        };
    }
}
