package com.billsburgers;

class Burger {

    private String type, toppings;
    private double price;
    private int numToppings, maxToppings;

    public Burger(String type, double basePrice) {

        this.type = type;
        this.price = basePrice;
        numToppings = 0;
        toppings = "";

        maxToppings = isDeluxe() ? 5 : 3;
    }

    public void addTopping(String topping, double price) {

        if (numToppings < maxToppings) {

            numToppings++;
            toppings += numToppings == 1 ? topping : " + " + topping;
            if (!isDeluxe()) {
                this.price += price;
            }
        } else {
            System.out.println(topping + " couldn't be added since maximum number of toppings has been reached");
        }
    }

    public String getPrice() {

        return String.format("%.2f", price);
    }

    public String getBurgerBill() {

        String toppingsForBill = toppings.isEmpty() ? "No toppings" : toppings;
        return String.format("%s (%s) - $%.2f", type, toppingsForBill, price);
    }

    public boolean isDeluxe() {

        return type.toLowerCase().contains("deluxe");
    }
}
